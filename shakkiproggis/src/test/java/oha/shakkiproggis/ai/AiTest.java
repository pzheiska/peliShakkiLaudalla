/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oha.shakkiproggis.ai;

import oha.ai.AI;
import oha.shakkiproggis.MoveValidator;
import oha.shakkiproggis.PawnPromoChooser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pyry
 */
public class AiTest {
	
	public AiTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
		

	}
	
	@After
	public void tearDown() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void hello() {
	
		PawnPromoChooser pc1 = new PawnPromoChooser();
		PawnPromoChooser pc2 = new PawnPromoChooser();
		
		MoveValidator mv = new MoveValidator(pc1, pc2);
		
		AI ai = new AI(mv, pc2);
		

		boolean t = true;
			
		t = t ? mv.move("E2E3") : t;
		t = t ? ai.move() : t;
		t = t ? mv.move("F1E2") : t;
		t = t ? ai.move() : t;
		t = t ? mv.move("G1F3") : t;
		t = t ? ai.move() : t;
		t = t ? mv.move("E1G1") : t;
	
		
		assertEquals(true, t);
	
	
	}
}
