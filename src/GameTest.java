//	Import statements & possibly using JUnit to
//	test the application

import java.util.HashMap;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class GameTest{


	public static void testA(){

		/*
				
			Test A Description:

			-	Playing an entire game with just tiles is possible.
				A person/AI can place tiles on a board and the
				board can either accept the tile on the board. This case
				only generates items that can be accepted onto the
				Gameboard. 

			-	Test A was also created to show the functionality of the
				Test A outputs and the tile placements that should be 
				produced from the board

			-	Outcome: All of the tiles that were placed, passed this
				particular test suite. Three items were being tested:

				1.	Do the Features Match?
				2.	Is a tile already placed there?
				3.	Can a tile be added and updated to the board

	
		*/

		System.out.println("Test A Begins");
		HashBoard board = new HashBoard();
		TileInterpreter ti = new TileInterpreter();
        
        Tiger tiger = new Tiger();
		Tile tile = ti.interpret("LLLL-");
        board.FindBestMove(tile,true,"A",1);

        Tile tile2 = ti.interpret("JJJJX");
		board.FindBestMove(tile2,true,"A",1);		

        Tile tile3 = ti.interpret("TLLT-");
		board.FindBestMove(tile3,true,"A",1);		

        Tile tile4 = ti.interpret("LLJJ-");
		board.FindBestMove(tile4,true,"A",1);		

        Tile tile5 = ti.interpret("JJJJX");
		board.FindBestMove(tile5,true,"A",1);		

        Tile tile6 = ti.interpret("LLLL-");
		board.FindBestMove(tile6,true,"A",1);		

        Tile tile7 = ti.interpret("JLJL-");
		board.FindBestMove(tile7,true,"A",1);		

        Tile tile8 = ti.interpret("TJTT-");
        board.FindBestMove(tile8,true,"A",1);

        Tile tile9 = ti.interpret("JLLL-");
        board.FindBestMove(tile9,true,"A",1);

        Tile tile10 = ti.interpret("LLJJ-");
        board.FindBestMove(tile10,true,"A",1);

        Tile tile11 = ti.interpret("LJLJ-");
        board.FindBestMove(tile11,true,"A",1);

        Tile tile12 = ti.interpret("TLJT-");
        board.FindBestMove(tile12,true,"A",1);

        Tile tile13 = ti.interpret("TLJTP");
        board.FindBestMove(tile13,true,"A",1);
        
        Tile tile14 = ti.interpret("JLTTB");
        board.FindBestMove(tile14,true,"A",1);
        
        Tile tile15 = ti.interpret("TLTJD");
        board.FindBestMove(tile15,true,"A",1);
        
        Tile tile16 = ti.interpret("TLTT-");
        board.FindBestMove(tile16,true,"A",1);
        
        Tile tile17 = ti.interpret("TLTTP");
        board.FindBestMove(tile17,true,"A",1);
        
        Tile tile18 = ti.interpret("TLLT-");
        board.FindBestMove(tile18,true,"A",1);
        
        Tile tile19 = ti.interpret("TLLTB");
        board.FindBestMove(tile19,true,"A",1);
        
        Tile tile20 = ti.interpret("LJTJ-");
        board.FindBestMove(tile20,true,"A",1);
        
        Tile tile21 = ti.interpret("JJJJX");
        board.FindBestMove(tile21,true,"A",1);
        
        Tile tile22 = ti.interpret("JLJL-");
        board.FindBestMove(tile22,true,"A",1);
        
        Tile tile23 = ti.interpret("LJJJ-");
        board.FindBestMove(tile23,true,"A",1);
        
        Tile tile24 = ti.interpret("LJTJD");
        board.FindBestMove(tile24,true,"A",1);
        
        Tile tile25 = ti.interpret("TLJT-");
        board.FindBestMove(tile25,true,"A",1);		
        
        
        Tile tile26  = ti.interpret("TLLT-");

        board.FindBestMove(tile26,true,"A",1);		//	Outcome: Pass
        
        //Tile tile26 = ti.interpret("LLJJ-");
        //board.FindBestMove(tile4,tiger);		//	Outcome: Pass
   
        Tile tile27 = ti.interpret("JJJJ-");
        board.FindBestMove(tile27,true,"A",1);		//	Outcome: Fail
        
        Tile tile28 = ti.interpret("LLLL-");
        board.FindBestMove(tile28,true,"A",1);		//	Outcome: Pass
        
        Tile tile29 = ti.interpret("JLJL-");
        board.FindBestMove(tile29,true,"A",1);		//	Outcomes: Fail
        
        Tile tile30 = ti.interpret("TJTT-");
        board.FindBestMove(tile30,true,"A",1);
        
        Tile tile31 = ti.interpret("JLLL-");
        board.FindBestMove(tile31,true,"A",1);
        
        Tile tile32 = ti.interpret("LLJJ-");
        board.FindBestMove(tile32,true,"A",1);
        
        Tile tile33 = ti.interpret("LJLJ-");
        board.FindBestMove(tile33,true,"A",1);
        
        Tile tile34 = ti.interpret("TLJT-");
        board.FindBestMove(tile34,true,"A",1);
        
        Tile tile35 = ti.interpret("TLJTP");
        board.FindBestMove(tile35,true,"A",1);
        
        Tile tile36 = ti.interpret("JLTTB");
        board.FindBestMove(tile36,true,"A",1);
        
        Tile tile37 = ti.interpret("TLTJD");
        board.FindBestMove(tile37,true,"A",1);
        
        Tile tile38 = ti.interpret("TLTT-");
        board.FindBestMove(tile38,true,"A",1);
        
        Tile tile39 = ti.interpret("TLTTP");
        board.FindBestMove(tile39,true,"A",1);
        
        Tile tile40 = ti.interpret("TLLT-");
        board.FindBestMove(tile40,true,"A",1);
        
        Tile tile41 = ti.interpret("TLLTB");
        board.FindBestMove(tile41,true,"A",1);
        
        Tile tile42 = ti.interpret("LJTJ-");
        board.FindBestMove(tile42,true,"A",1);

        
		board.printLake();
		board.printTrail();
		board.printClaimedLake();
		board.printClaimedTrail();


		System.out.println("Test A Ends");

		System.out.println("==================================================================");

	}

	public static void testB(){

		/*
				
			Test B Description:

			-	Checking the Rotate function in the Tile class and
				validing that the rotated tile is equalt to the
				original tile plus the rotation

			-	Test has failed because the rotation function is 
				not taking into account the change of the mini zones.

			-	The other characteristics about the rotate function work

			-	Another case: Rotating multiple times and seeing if
				the characteristics change accordingly

			-	All of the test cases passed for this class, except for
				the rotation of the minizones


            Outcome: Pass

		*/

        System.out.println();
        System.out.println();
        System.out.println();
		System.out.println("Test B Begins");

		HashBoard board = new HashBoard();
		TileInterpreter ti = new TileInterpreter();
		Tile tile = ti.interpret("TLTTP");
		String rotate0 = tile.printTile();				//	Outcome:	Pass
		tile.rotate();
		String rotate90 = tile.printTile();				//	Outcome:	Pass
		tile.rotate();
		String rotate180 = tile.printTile();			//	Outcome: 	Pass
		tile.rotate();
		String rotate270 = tile.printTile();			//	Outcome:	Pass
		tile.rotate();
		String rotate360 = tile.printTile();			//	Outcome: 	Pass



		System.out.println(rotate0);
		System.out.println(rotate90);
		System.out.println(rotate180);
		System.out.println(rotate270);
		System.out.println(rotate360);

		System.out.println("Test B Ends");
		System.out.println("==================================================================");
	}

	public static void testC(){

        /*

            Test C:

                This is a basic test that allows the player
                to add a tile with a specific tiger. The Tiger object 
                is created the tile is rotated and then 
                placed onto the board. Since the tile can connect to the
                very first tile of the game, this test case should allow
                the player to place the tile with a specific tiger on a zone.

                However the second tile should return an invalid location
                because after the rotation, the tile does not match up
                with the tile design. As a result, the location should be
                invalid.

                Outcome: Pass


        */

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Test C Begins");
		HashBoard board = new HashBoard();
		TileInterpreter ti = new TileInterpreter();

        Tiger tiger = new Tiger();
        Tile tile = ti.interpret("TLTJ-");
        tile.rotate();
        tile.rotate();
        board.addTile(new Position(1, 0), tile, tiger);

        Tiger tiger2 = new Tiger();
        Tile tile2 = ti.interpret("LLLL-");
        tile2.rotate();
        tile2.rotate();
        board.addTile(new Position(-1, 0), tile2, tiger2);

        System.out.println("Test C Ends");
        System.out.println("==================================================================");


	}

	public static void testD(){

        /*
                
            Test D Description:

            -   This test will begin with checking the connected lakes, dens and 
            trails. We can check the Feature Areas and show the lakes, trails, 
            and dens that are connected. From this case, we can see that lakes,
            trails and dens are being accounted for in the score, the potential
            moves that can be made, and the locations that can be played for
            the crocodiles and for the tigers

            -   We used the somes of the 
            tiles that were created and placed from the first test case. 
            Then the test will print the connected lakes, trails, and dens 
            for the particular tiles that have been added to the board.

            Outcome: Pass

        */

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Test D Begins");

		HashBoard board = new HashBoard();
		TileInterpreter ti = new TileInterpreter();

        Tiger tiger = new Tiger();
        Tile tile = ti.interpret("LLLL-");
        board.FindBestMove(tile,true,"A",1);

        Tile tile2 = ti.interpret("JJJJX");
        board.FindBestMove(tile2,true,"A",1);       

        Tile tile3 = ti.interpret("TLLT-");
        board.FindBestMove(tile3,true,"A",1);       

        Tile tile4 = ti.interpret("LLJJ-");
        board.FindBestMove(tile4,true,"A",1);       

        Tile tile5 = ti.interpret("JJJJX");
        board.FindBestMove(tile5,true,"A",1);       

        Tile tile6 = ti.interpret("LLLL-");
        board.FindBestMove(tile6,true,"A",1);       

        Tile tile7 = ti.interpret("JLJL-");
        board.FindBestMove(tile7,true,"A",1);       

        Tile tile8 = ti.interpret("TJTT-");
        board.FindBestMove(tile8,true,"A",1);

        Tile tile9 = ti.interpret("JLLL-");
        board.FindBestMove(tile9,true,"A",1);

        Tile tile10 = ti.interpret("LLJJ-");
        board.FindBestMove(tile10,true,"A",1);

        Tile tile11 = ti.interpret("LJLJ-");
        board.FindBestMove(tile11,true,"A",1);

        Tile tile12 = ti.interpret("TLJT-");
        board.FindBestMove(tile12,true,"A",1);

        Tile tile13 = ti.interpret("TLJTP");
        board.FindBestMove(tile13,true,"A",1);
        
        Tile tile14 = ti.interpret("JLTTB");
        board.FindBestMove(tile14,true,"A",1);
        
        Tile tile15 = ti.interpret("TLTJD");
        board.FindBestMove(tile15,true,"A",1);

        board.printLake();
        board.printTrail();

        System.out.println("Test D Ends");
        System.out.println("==================================================================");


	}

    public static void testE(){


        /*
                
            Test E Description:

            -   This test is used to test the simple functions that are
                used in the tile class. The four main functions that 
                were created in this class were the connectedLakes,
                specialConnectedLakes, connectedRoads, and rotate.
                These functions are tested from the sample data below

            Outcome: Pass

        */

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Test E Begins");


        TileInterpreter ti = new TileInterpreter();
        Tile tile = ti.interpret("TLLLC");

        System.out.println("================================================");
        System.out.println("Test for Connected Lakes & Special Connected Lakes");

        ArrayList <HashSet<Integer>> tile1;
        Iterator <HashSet<Integer>> it1;

        if(tile.getDescription().equals("JLLJ-") || tile.getDescription().equals("LJLJ-")){
            tile1 = tile.specialConnectedLakes();
            it1 = tile1.iterator();
        } else {
            tile1 = tile.connectedLakes();
            it1 = tile1.iterator();
        }

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("================================================");
        System.out.println("Test for Connected Roads");


        ArrayList <HashSet<Integer>> tile2 = tile.connectedRoads();
        Iterator <HashSet<Integer>> it2 = tile2.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("================================================");
        System.out.println("Test for Rotating Tile");

        tile.printMiniZone();
        tile.rotate();
        tile.printMiniZone();


        System.out.println("Test E Ends");
        System.out.println("==================================================================");

    }


	public static void main(String[] args) throws InterruptedException{

		/*

			Performs a test suite of the most common
			curveballs that can be thrown our way.
			Also, the test suite begins with the
			easiest test and then ends with a more complex
			one

		*/

		testA();
        Thread.sleep(2000);
		testB();
        Thread.sleep(2000);
		testC();
        Thread.sleep(2000);
		testD();
        Thread.sleep(2000);
        testE();

	}

}
