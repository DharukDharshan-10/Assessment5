package com.voting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VoterTest {
    @Test
    public void testEligibleVoter() {
        Voter voter = new Voter("Amit", 21, "Indian", "VOT123", true);
        assertEquals("ELIGIBLE", voter.checkEligibility());
    }

    @Test
    public void testUnderageVoter() {
        Voter voter = new Voter("Rahul", 16, "Indian", "VOT456", true);
        assertEquals("NOT ELIGIBLE. Reason: Underage (Age must be >= 18).", voter.checkEligibility());
    }
}
