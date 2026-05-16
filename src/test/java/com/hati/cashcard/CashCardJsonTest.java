package com.hati.cashcard;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

@JsonTest
class CashCardJsonTest {

    @Autowired
    private JacksonTester<CashCard> json; // helper for Json testing, for single object

    @Autowired
    private JacksonTester<CashCard[]> jsonList;// helper for Json testing, for list of objects

    private CashCard[] cashCards;

    @BeforeEach
    void setUp() {
        cashCards = new CashCard[] {
                new CashCard(99L, 123.45, "sarah1"),
                new CashCard(100L, 1.00, "sarah1"),
                new CashCard(101L, 150.00, "sarah1")
        };
    }

    @Test
    // java to json
    void cashCardListSerializationTest() throws IOException {
        assertThat(jsonList.write(cashCards)).isStrictlyEqualToJson("list.json");
    }

    @Test
    // json to java
    void cashCardListDeserializationTest() throws IOException {
        String expected = """
                [
                   { "id": 99, "amount": 123.45, "owner": "sarah1" },
                   { "id": 100, "amount": 1.00, "owner": "sarah1" },
                   { "id": 101, "amount": 150.00, "owner": "sarah1" }
                ]
                """;
        assertThat(jsonList.parse(expected)).isEqualTo(cashCards);
    }

}
