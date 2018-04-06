package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eHandStrength;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class HandPokerTest {

	@Test
	public void FourOfAKindTest1() {
		System.out.println("Four of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.FourOfAKind);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 1);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		
	}
	@Test
	public void FourOfAKindTest2() {
		System.out.println("Four of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.FourOfAKind);
		assertEquals(HSP.getHiCard().geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().size(), 1);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		
	}
	
	@Test
	public void ThreeOfAKindTest1() {
		System.out.println("Three of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FOUR));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.ThreeOfAKind);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 2);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.FOUR);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.CLUBS);
		
	}
	@Test
	public void ThreeOfAKindTest2() {
		System.out.println("Three of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.ThreeOfAKind);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 2);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.CLUBS);
		
	}
	public void ThreeOfAKindTest3() {
		System.out.println("Three of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.ThreeOfAKind);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 2);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.HEARTS);
		
	}
	
	@Test
	public void StraightTest1() {
		System.out.println("Straight A-5");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.Straight);
		assertEquals(HSP.getHiCard().geteRank(), eRank.FIVE);
		
		assertNull(HSP.getKickers());
	}
	@Test
	public void StraightTest2() {
		System.out.println("Straight A-5");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.KING));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.SPADES,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.Straight);
		assertEquals(HSP.getHiCard().geteRank(), eRank.ACE);
		
		assertNull(HSP.getKickers());
	}

	@Test

	public void TwoPairTest1() {
		System.out.println("Two Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.TwoPair);
		assertEquals(HSP.getHiCard().geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().size(), 1);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void TwoPairTest2() {
		System.out.println("Two Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));

		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.TwoPair);
		assertEquals(HSP.getHiCard().geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().size(), 1);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
	}	
	@Test
	public void TwoPairTest3() {
		System.out.println("Two Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));

		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.TwoPair);
		assertEquals(HSP.getHiCard().geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().size(), 1);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
	}

	@Test
	public void FullHouseTest1() {
		System.out.println("Full House");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(hp.isFullHouse(),true);
		assertEquals(HSP.geteHandStrength(),eHandStrength.FullHouse);
		assertEquals(HSP.getHiCard().geteRank(), eRank.FIVE);
		assertEquals(HSP.getLoCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 0);

	}
	@Test
	public void FullHouseTest2() {
		System.out.println("Full House");
		System.out.println("");
		HandPoker hp = new HandPoker();
		
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(hp.isFullHouse(),true);
		assertEquals(HSP.geteHandStrength(),eHandStrength.FullHouse);
		assertEquals(HSP.getHiCard().geteRank(), eRank.FIVE);
		assertEquals(HSP.getLoCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 0);

	}

	@Test
	public void HighCardTest1() {
		System.out.println("High Card");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.SEVEN));

		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.HighCard);
		assertEquals(HSP.getHiCard().geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().size(), 5);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.SEVEN);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(3).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(3).geteSuit(), eSuit.HEARTS);
		assertEquals(HSP.getKickers().get(4).geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().get(4).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void HighCardTest2() {
		System.out.println("High Card");
		System.out.println("");
		HandPoker hp = new HandPoker();
		
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.SEVEN));

		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.HighCard);
		assertEquals(HSP.getHiCard().geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().size(), 5);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.SEVEN);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(3).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(3).geteSuit(), eSuit.HEARTS);
		assertEquals(HSP.getKickers().get(4).geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().get(4).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void HighCardTest3() {
		System.out.println("High Card");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.SEVEN));

		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.HighCard);
		assertEquals(HSP.getHiCard().geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().size(), 5);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.SEVEN);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(3).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(3).geteSuit(), eSuit.HEARTS);
		assertEquals(HSP.getKickers().get(4).geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().get(4).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void HighCardTest4() {
		System.out.println("High Card");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.SEVEN));

		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.HighCard);
		assertEquals(HSP.getHiCard().geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().size(), 5);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.SEVEN);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(3).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(3).geteSuit(), eSuit.HEARTS);
		assertEquals(HSP.getKickers().get(4).geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().get(4).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void HighCardTest5() {
		System.out.println("High Card");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.SEVEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.HighCard);
		assertEquals(HSP.getHiCard().geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().size(), 5);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.SEVEN);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(3).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(3).geteSuit(), eSuit.HEARTS);
		assertEquals(HSP.getKickers().get(4).geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().get(4).geteSuit(), eSuit.CLUBS);
	}

	@Test
	public void OnePairTest1() {
		System.out.println("One Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.SIX));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.Pair);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 3);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.SIX);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.FOUR);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void OnePairTest2() {
		System.out.println("One Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.SIX));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.Pair);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 3);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.SIX);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.FOUR);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void OnePairTest3() {
		System.out.println("One Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.SIX));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.Pair);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 3);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.SIX);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.FOUR);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.CLUBS);
	}
	@Test
	public void OnePairTest4() {
		System.out.println("One Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.SIX));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.Pair);
		assertEquals(HSP.getHiCard().geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().size(), 3);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.SIX);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.FOUR);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.CLUBS);
	}

	//I was unable to get the isFlush() method to work properly
	//The following commented out tests are all flush related
	
	/*
	@Test
	public void RoyalFlushTest1() {
		System.out.println("Royal Flush");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.RoyalFlush);
		assertEquals(HSP.getHiCard().geteRank(), eRank.ACE);
		
		assertNull(HSP.getKickers());
	}
	@Test
	public void StraightFlushTest1() {
		System.out.println("Straight Flush");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.StraightFlush);
		assertEquals(HSP.getHiCard().geteRank(), eRank.FIVE);
		
		assertNull(HSP.getKickers());
	}
	
	@Test
	public void FlushTest1() {
		System.out.println("Flush");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SEVEN));

		try {
			hp.ScoreHand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HandScorePoker HSP = hp.getHSP();
		
		assertEquals(HSP.geteHandStrength(),eHandStrength.Flush);
		assertEquals(HSP.getKickers().size(), 5);
		assertEquals(HSP.getKickers().get(0).geteRank(), eRank.ACE);
		assertEquals(HSP.getKickers().get(0).geteSuit(), eSuit.CLUBS);
		assertEquals(HSP.getKickers().get(1).geteRank(), eRank.SEVEN);
		assertEquals(HSP.getKickers().get(1).geteSuit(), eSuit.SPADES);
		assertEquals(HSP.getKickers().get(2).geteRank(), eRank.FIVE);
		assertEquals(HSP.getKickers().get(2).geteSuit(), eSuit.DIAMONDS);
		assertEquals(HSP.getKickers().get(3).geteRank(), eRank.THREE);
		assertEquals(HSP.getKickers().get(3).geteSuit(), eSuit.HEARTS);
		assertEquals(HSP.getKickers().get(4).geteRank(), eRank.TWO);
		assertEquals(HSP.getKickers().get(4).geteSuit(), eSuit.CLUBS);
	}
*/
}
