/*
 * Alfred Thomas Cecil
 * 12/16/22
 * Capstone Project
 */

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.animation.PathTransition;
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.util.Duration;

import javax.swing.plaf.LabelUI;

import javafx.animation.*;
import javafx.scene.input.KeyCode;

public class Challenge_Dashers extends Application{
	
	boolean small = false;
	boolean medium = false;
	boolean large = false;
	boolean player1T = true;
	boolean player2T = false;
	boolean player3T = false;
	boolean player4T = false;
	boolean oneP = false;
	boolean twoP = false;
	boolean threeP = false;
	boolean fourP = false;
	boolean R = false;
	boolean B = false;
	boolean Y = false;
	boolean G = false;
	boolean bSteps = false;
	
	int playerNum = 0;
	int dRoll = -1;
	int p1 = 0;
	int p2 = 0;
	int p3 = 0;
	int p4 = 0;
	int p1T = 0;
	int p2T = 0;
	int p3T = 0;
	int p4T = 0;
	int bonus = 0;
	int limit = 0;
	String name1 = "";
	String name2 = "";
	String name3 = "";
	String name4 = "";
	String Player1 = "";
	String Player2 = "";
	String Player3 = "";
	String Player4 = "";
	String prompt = "";
	//pane.getChildren.addAll(space1, space2,space3, space4, space5, space6, space7, space8, space9, space10, );
	Polygon space1 = new Polygon();
	Polygon space2 = new Polygon();
	Polygon space3 = new Polygon();
	Polygon space4 = new Polygon();
	Polygon space5 = new Polygon();
	Polygon space6 = new Polygon();
	Polygon space7 = new Polygon();
	Polygon space8 = new Polygon();
	Polygon space9 = new Polygon();
	Polygon space10 = new Polygon();
	Polygon space11 = new Polygon();
	Polygon space12 = new Polygon();
	Polygon space13 = new Polygon();
	Polygon space14 = new Polygon();
	Polygon space15 = new Polygon();
	Polygon space16 = new Polygon();
	Polygon space17 = new Polygon();
	Polygon space18 = new Polygon();
	Polygon space19 = new Polygon();
	Polygon space20 = new Polygon();
	Rectangle pawn1 = new Rectangle(15,30,15,30);
	Rectangle pawn2 = new Rectangle(15,30,15,30);
	Rectangle pawn3 = new Rectangle(15,30,15,30);
	Rectangle pawn4 = new Rectangle(15,30,15,30);
	TextArea taskSpace = new TextArea();
	TextField turnOrder = new TextField();
	Button success = new Button("Success");
	Button failure = new Button("Fail");
	Button roll = new Button("Roll");
	
	
	
	Pane pane = new Pane();
	Rectangle die = new Rectangle(100,100,100,100);	
	Circle d1 = new Circle(10);
	Circle d2 = new Circle(10);
	Circle d3 = new Circle(10);
	Circle d4 = new Circle(10);
	Circle d5 = new Circle(10);
	Circle d6 = new Circle(10);
	
	public void start(Stage primaryStage) {
		Scene scene = new Scene(pane, 1000, 800);
		primaryStage.setTitle("Challenge Dashers");
		primaryStage.setScene(scene); 
		primaryStage.show();
		HBox h1 = new HBox();
		pane.getChildren().add(h1);
		Label turn = new Label("");
		TextField n = new TextField();
		Button nameOne = new Button("Next");
		Button nameTwo = new Button("Next");
		Button nameThree = new Button("Next");
		Button nameFour = new Button("Next");
		Button start = new Button("Let's go!");
		Button confirm = new Button("Confirm");
		
		nameOne.setScaleX(1.5);
		nameOne.setScaleY(1.5);
		nameOne.setTranslateX(450);
		nameOne.setTranslateY(200);
		nameTwo.setScaleX(1.5);
		nameTwo.setScaleY(1.5);
		nameTwo.setTranslateX(450);
		nameTwo.setTranslateY(200);
		nameTwo.setScaleX(1.5);
		nameThree.setScaleX(1.5);
		nameThree.setScaleY(1.5);
		nameThree.setTranslateX(450);
		nameThree.setTranslateY(200);
		nameFour.setScaleX(1.5);
		nameFour.setScaleY(1.5);
		nameFour.setTranslateX(450);
		nameFour.setTranslateY(200);
		confirm.setScaleX(1.5);
		confirm.setScaleY(1.5);
		confirm.setTranslateX(450);
		confirm.setTranslateY(200);
		start.setScaleX(2.0);
		start.setScaleY(2.0);
		start.setTranslateX(450);
		start.setTranslateY(300);
		start.setDisable(true);
		
		
		Label greet = new Label("Challenge Dashers");
		greet.setFont(Font.font("arial",FontWeight.NORMAL,FontPosture.ITALIC, 30));
		greet.setTranslateX(50);
		pane.getChildren().add(greet);
		Label message = new Label("How many are playing today?");
		message.setFont(Font.font("arial",FontWeight.NORMAL,FontPosture.REGULAR, 20));
		pane.getChildren().add(message);
		message.setTranslateX(100);
		message.setTranslateY(100);
		RadioButton two = new RadioButton("2 Players ");
		RadioButton three = new RadioButton("3 Players ");
		RadioButton four = new RadioButton("4 Players");
		RadioButton quick = new RadioButton("Short ");
		RadioButton normal = new RadioButton("Normal ");
		RadioButton slow = new RadioButton("Long");
		ToggleGroup map = new ToggleGroup();
		ToggleGroup pCount = new ToggleGroup();
		two.setToggleGroup(pCount);
		three.setToggleGroup(pCount);
		four.setToggleGroup(pCount);
		quick.setToggleGroup(map);
		normal.setToggleGroup(map);
		slow.setToggleGroup(map);
		h1.getChildren().addAll(two,three,four);
		Button next = new Button("Next");
		next.setScaleX(1.5);
		next.setScaleY(1.5);
		next.setTranslateX(450);
		next.setTranslateY(200);
			pane.getChildren().add(next);
			next.setDisable(true);
			greet.setTranslateX(350);
			greet.setTranslateY(0);
			message.setTranslateX(350);
			message.setTranslateY(50);
			h1.setTranslateX(350);
			h1.setTranslateY(125);
			two.setOnAction(e -> {
				if(two.isSelected()) {
					playerNum = 2;
					next.setDisable(false);
				}
			});
			three.setOnAction(e -> {
				if(three.isSelected()) {
					playerNum = 3;
					next.setDisable(false);
				}
			});
			four.setOnAction(e -> {
				if(four.isSelected()) {
					playerNum = 4;
					next.setDisable(false);
				}
			});
			quick.setOnAction(e -> {
				if(quick.isSelected()) {
					small = true;
					medium = false;
					large = false;
					start.setDisable(false);
				}
			});
			normal.setOnAction(e -> {
				if(normal.isSelected()) {
					medium = true;
					small = false;
					large = false;
					start.setDisable(false);
				}
			});
			slow.setOnAction(e -> {
				if(slow.isSelected()) {
					large = true;
					small = false;
					medium = false;
					start.setDisable(false);
				}
			});
			
			next.setOnAction(e -> {
				h1.getChildren().removeAll(two,three,four);
				pane.getChildren().remove(next);
				pane.getChildren().addAll(nameOne,n);
				n.setTranslateX(400);
				n.setTranslateY(100);
				message.setText("Please enter the first name");
			});
			
			nameOne.setOnAction(e -> {
				if(n.getText().equals("")) {
					name1 = "Player 1";
					n.clear();
					pane.getChildren().remove(nameOne);
					pane.getChildren().add(nameTwo);
					message.setText("Please enter the second name");
				}
				else {
					name1 = n.getText();
					n.clear();
					pane.getChildren().remove(nameOne);
					pane.getChildren().add(nameTwo);
					message.setText("Please enter the second name");
				}
			});
			nameTwo.setOnAction(e -> {
				if(n.getText().equals("")) {
					name2 = "Player 2";
					n.clear();
					pane.getChildren().remove(nameTwo);
				}
				else {
					name2 = n.getText();
					n.clear();
					pane.getChildren().remove(nameTwo);
				}
				if(playerNum >= 3) {
					pane.getChildren().add(nameThree);
					message.setText("Please enter a third name");
					nameThree.setOnAction(F ->{
						if(n.getText().equals("")) {
							name3 = "Player 3";
							n.clear();
							pane.getChildren().remove(nameThree);
						}
						else {
							name3 = n.getText();
							n.clear();
							pane.getChildren().remove(nameThree);
						}
						if(playerNum == 4) {
					pane.getChildren().add(nameFour);
					message.setText("Please enter a fourth name");
					nameFour.setOnAction(f ->{
						if(n.getText().equals("")) {
							name4 = "Player 4";
							n.clear();
							pane.getChildren().remove(nameFour);
							pane.getChildren().remove(n);
							pane.getChildren().add(turn);
							turn.setTranslateX(400);
							turn.setTranslateY(100);
							message.setText("Ok, here is the turn order");
							turnOrder();
							turn.setText(Player1 + ", " + Player2 + ", " + Player3 + ", " + Player4);
							pane.getChildren().add(confirm);
							
						}
						else {
							name4 = n.getText();
							n.clear();
							pane.getChildren().remove(nameFour);
							pane.getChildren().remove(n);
							pane.getChildren().add(turn);
							turn.setTranslateX(400);
							turn.setTranslateY(100);
							message.setText("Ok, here is the turn order");
							turnOrder();
							turn.setText(Player1 + ", " + Player2 + ", " + Player3 + ", " + Player4);
							pane.getChildren().add(confirm);
						}
					});
				}
						else {
							pane.getChildren().remove(n);
							pane.getChildren().add(turn);
							turn.setTranslateX(400);
							turn.setTranslateY(100);
							message.setText("Ok, here is the turn order");
							turnOrder();
							turn.setText(Player1 + ", " + Player2 + ", " + Player3);
							pane.getChildren().add(confirm);
						}
					});
				}
				else {
					pane.getChildren().remove(n);
					pane.getChildren().add(turn);
					turn.setTranslateX(400);
					turn.setTranslateY(100);
					message.setText("Ok, here is the turn order");
					turnOrder();
					turn.setText(Player1 + ", " + Player2);
					pane.getChildren().add(confirm);
					
				}
				
			});	
		confirm.setOnAction(e -> {
			message.setText("Now set the game's length and you can begin");
			h1.getChildren().addAll(quick,normal,slow);
			pane.getChildren().remove(confirm);
			pane.getChildren().add(start);
		});
			
		
		taskSpace.setScaleX(1);
		taskSpace.setScaleY(1);
		
		taskSpace.setTranslateX(225);
		taskSpace.setTranslateY(200);
		success.setScaleX(1.5);
		success.setScaleY(1.5);
		failure.setScaleX(1.5);
		failure.setScaleY(1.5);
		success.setTranslateX(240);
		success.setTranslateY(385);
		failure.setTranslateX(695);
		failure.setTranslateY(385);
		start.setOnAction(E ->{
		pane.getChildren().removeAll(greet, message, h1, start, turn);	
		
		
		
		HBox hBox = new HBox();
		
		roll.setScaleX(1.5);
		roll.setScaleY(1.5);
		roll.setTranslateX(600);
		roll.setTranslateY(50);
		pane.getChildren().add(roll);
		
		
		turnOrder.setEditable(false);
		if(playerNum == 2) {
			turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
		}
		else if(playerNum == 3) {
			turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
		}
		else {
			turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
		}
		pane.getChildren().add(turnOrder);
		turnOrder.setMinWidth(350);
		turnOrder.setTranslateX(75);
		if(medium == true) {
			turnOrder.setTranslateX(320);
			turnOrder.setTranslateY(110);
		}
		
		die.setTranslateX(350);
		die.setTranslateY(-90);
		d1.setTranslateY(-50);
		d2.setTranslateY(-50);
		d3.setTranslateY(-50);
		d4.setTranslateY(-50);
		d5.setTranslateY(-50);
		d6.setTranslateY(-50);
		die.setStroke(Color.BLACK);
		die.setFill(Color.WHITE);
		
		d1.setStroke(Color.BLACK);
		d1.setFill(Color.BLACK);
		
		d2.setStroke(Color.BLACK);
		d2.setFill(Color.BLACK);
		
		d3.setStroke(Color.BLACK);
		d3.setFill(Color.BLACK);
		
		d4.setStroke(Color.BLACK);
		d4.setFill(Color.BLACK);
		
		d5.setStroke(Color.BLACK);
		d5.setFill(Color.BLACK);
		
		d6.setStroke(Color.BLACK);
		d6.setFill(Color.BLACK);
		spaceCreate(space1);
		spaceCreate(space2);
		spaceCreate(space3);
		spaceCreate(space4);
		spaceCreate(space5);
		spaceCreate(space6);
		spaceCreate(space7);
		spaceCreate(space8);
		spaceCreate(space9);
		spaceCreate(space10);
		space1.setFill(Color.WHITE);
		space1.setStroke(Color.BLACK);
		
		if(small == true) {
			limit = 10;
			System.out.print(limit);
			sizeS();
			pane.getChildren().add(new Line(space1.getTranslateX() + 40,space1.getTranslateY() + 25,space10.getTranslateX() + 40,space10.getTranslateY() + 25));
			pane.getChildren().addAll(space1, space2, space3, space4, space5, space6, space7, space8, space9, space10);
			space10.setFill(Color.WHITE);
			space10.setStroke(Color.GOLD);
			if(playerNum == 2) {
				twoPlayer(space2);
				twoPlayer(space3);
				twoPlayer(space4);
				twoPlayer(space5);
				twoPlayer(space6);
				twoPlayer(space7);
				twoPlayer(space8);
				twoPlayer(space9);
			}
			 else if(playerNum == 3) {
				threePlayer(space2);
				threePlayer(space3);
				threePlayer(space4);
				threePlayer(space5);
				threePlayer(space6);
				threePlayer(space7);
				threePlayer(space8);
				threePlayer(space9);
			}
			 else if(playerNum == 4) {
				fourPlayer(space2);
				fourPlayer(space3);
				fourPlayer(space4);
				fourPlayer(space5);
				fourPlayer(space6);
				fourPlayer(space7);
				fourPlayer(space8);
				fourPlayer(space9);
				
			}
			
			
		}
		
		else if(medium == true) {
			limit = 15;
			System.out.print(limit);
			spaceCreate(space11);
			spaceCreate(space12);
			spaceCreate(space13);
			spaceCreate(space14);
			spaceCreate(space15);
			sizeM();
			pane.getChildren().add(new Line(space1.getTranslateX() + 37,space1.getTranslateY() + 20,space6.getTranslateX() + 37,space6.getTranslateY() + 20));
			pane.getChildren().add(new Line(space6.getTranslateX() + 37,space6.getTranslateY() + 25,space7.getTranslateX() + 37,space7.getTranslateY() + 25));
			pane.getChildren().add(new Line(space7.getTranslateX() + 40,space7.getTranslateY() + 25,space9.getTranslateX() + 40,space9.getTranslateY() + 25));
			pane.getChildren().add(new Line(space9.getTranslateX() + 37,space9.getTranslateY() + 25,space10.getTranslateX() + 37,space10.getTranslateY() + 25));
			pane.getChildren().add(new Line(space10.getTranslateX() + 37,space10.getTranslateY() + 20,space15.getTranslateX() + 37,space15.getTranslateY() + 20));
			pane.getChildren().addAll(space1, space2, space3, space4, space5, space6, space7, space8, space9, space10,space11, space12, space13, space14, space15);
			space15.setFill(Color.WHITE);
			space15.setStroke(Color.GOLD);
			
				
			
			if(playerNum == 2) {
				twoPlayer(space2);
				twoPlayer(space3);
				twoPlayer(space4);
				twoPlayer(space5);
				twoPlayer(space6);
				twoPlayer(space7);
				twoPlayer(space8);
				twoPlayer(space9);
				twoPlayer(space10);
				twoPlayer(space11);
				twoPlayer(space12);
				twoPlayer(space13);
				twoPlayer(space14);
				
			}
			 else if(playerNum == 3) {
				threePlayer(space2);
				threePlayer(space3);
				threePlayer(space4);
				threePlayer(space5);
				threePlayer(space6);
				threePlayer(space7);
				threePlayer(space8);
				threePlayer(space9);
				threePlayer(space10);
				threePlayer(space11);
				threePlayer(space12);
				threePlayer(space13);
				threePlayer(space14);
				
			}
			 else if(playerNum == 4) {
				fourPlayer(space2);
				fourPlayer(space3);
				fourPlayer(space4);
				fourPlayer(space5);
				fourPlayer(space6);
				fourPlayer(space7);
				fourPlayer(space8);
				fourPlayer(space9);
				fourPlayer(space10);
				fourPlayer(space11);
				fourPlayer(space12);
				fourPlayer(space13);
				fourPlayer(space14);
				
				
			}
			
		}
		
		else if(large == true) {
			limit = 20;
			System.out.print(limit);
			spaceCreate(space11);
			spaceCreate(space12);
			spaceCreate(space13);
			spaceCreate(space14);
			spaceCreate(space15);
			spaceCreate(space16);
			spaceCreate(space17);
			spaceCreate(space18);
			spaceCreate(space19);
			spaceCreate(space20);
			sizeL();
			pane.getChildren().add(new Line(space1.getTranslateX() + 37, space1.getTranslateY() + 20, space5.getTranslateX() + 37, space5.getTranslateY() + 20));
			pane.getChildren().add(new Line(space5.getTranslateX() + 37,space5.getTranslateY() + 25,space11.getTranslateX() + 37,space11.getTranslateY() + 25));
			pane.getChildren().add(new Line(space11.getTranslateX() + 37,space11.getTranslateY() + 25,space15.getTranslateX() + 37,space15.getTranslateY() + 25));
			pane.getChildren().add(new Line(space15.getTranslateX() + 40,space15.getTranslateY() + 25,space18.getTranslateX() + 40,space18.getTranslateY() + 25));
			pane.getChildren().addAll(space1, space2, space3, space4, space5, space6, space7, space8, space9, space10,space11, space12, space13, space14, space15, space16, space17);
			pane.getChildren().add(new Line(space18.getTranslateX() + 37, space18.getTranslateY() + 20, space20.getTranslateX() + 37, space20.getTranslateY() + 20));
			pane.getChildren().addAll(space18, space19, space20);
			space20.setFill(Color.WHITE);
			space20.setStroke(Color.GOLD);
			
			if(playerNum == 2) {
				twoPlayer(space2);
				twoPlayer(space3);
				twoPlayer(space4);
				twoPlayer(space5);
				twoPlayer(space6);
				twoPlayer(space7);
				twoPlayer(space8);
				twoPlayer(space9);
				twoPlayer(space10);
				twoPlayer(space11);
				twoPlayer(space12);
				twoPlayer(space13);
				twoPlayer(space14);
				twoPlayer(space15);
				twoPlayer(space16);
				twoPlayer(space17);
				twoPlayer(space18);
				twoPlayer(space19);
			}
			 else if(playerNum == 3) {
				threePlayer(space2);
				threePlayer(space3);
				threePlayer(space4);
				threePlayer(space5);
				threePlayer(space6);
				threePlayer(space7);
				threePlayer(space8);
				threePlayer(space9);
				threePlayer(space10);
				threePlayer(space11);
				threePlayer(space12);
				threePlayer(space13);
				threePlayer(space14);
				threePlayer(space15);
				threePlayer(space16);
				threePlayer(space17);
				threePlayer(space18);
				threePlayer(space19);
				
			}
			 else if(playerNum == 4) {
				fourPlayer(space2);
				fourPlayer(space3);
				fourPlayer(space4);
				fourPlayer(space5);
				fourPlayer(space6);
				fourPlayer(space7);
				fourPlayer(space8);
				fourPlayer(space9);
				fourPlayer(space10);
				fourPlayer(space11);
				fourPlayer(space12);
				fourPlayer(space13);
				fourPlayer(space14);
				fourPlayer(space15);
				fourPlayer(space16);
				fourPlayer(space17);
				fourPlayer(space18);
				fourPlayer(space19);
			}
		}
	
		pawn1.setFill(Color.DARKRED);
		pawn1.setStroke(Color.BLACK);
	
		pawn2.setFill(Color.DARKBLUE);
		pawn2.setStroke(Color.BLACK);
		
		pawn3.setFill(Color.GOLD);
		pawn3.setStroke(Color.BLACK);
		
		pawn4.setFill(Color.DARKGREEN);
		pawn4.setStroke(Color.BLACK);
		pawn1.setTranslateX(200);
		pawn1.setTranslateY(10);
		pawn2.setTranslateX(225);
		pawn2.setTranslateY(10);
		pawn3.setTranslateX(250);
		pawn3.setTranslateY(10);
		pawn4.setTranslateX(275);
		pawn4.setTranslateY(10);
		pane.getChildren().addAll(die,d1,d2,d3,d4,d5,d6);
		pane.getChildren().addAll(pawn1,pawn2);
		if(playerNum >= 3) {
			pane.getChildren().add(pawn3);
		}
		if(playerNum == 4) {
			pane.getChildren().add(pawn4);
		}
		//player1T = true;
		//while(p1 != limit && p2 != limit && p3 != limit && p4 != limit) {
		roll.setOnAction(e ->{
			if(player1T == true) {
				bSteps = true;
				p1 = roll(p1);
				travel(pawn1, p1);
				if(playerNum == 2) {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
				}
				else if(playerNum == 3) {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
				}
				else {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
				}

			
		}
			else if(player2T == true) {
			
			bSteps = true;
			p2 = roll(p2);
			travel(pawn2, p2);
			if(playerNum == 2) {
				turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
			}
			else if(playerNum == 3) {
				turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
			}
			else {
				turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
			}
			
	}
			else if(player3T == true) {
				
				bSteps = true;
				p3 = roll(p3);
				travel(pawn3, p3);
				if(playerNum == 2) {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
				}
				else if(playerNum == 3) {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
				}
				else {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
				}
				
		}
			else if(player4T == true) {
				
				bSteps = true;
				p4 = roll(p4);
				travel(pawn4, p4);
				if(playerNum == 2) {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
				}
				else if(playerNum == 3) {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
				}
				else {
					turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
				}
		}
		});

		});
	}
	public static void spaceCreate(Polygon space) {
		ObservableList<Double> list = space.getPoints();
		double centerX = 75 / 2, centerY = 50 / 2;
		double radius = Math.min(50, 50) * 0.4;
		int s = 6;
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}
	}
	public int roll(int p) {
		//475 30 10
		//int s = 5;
		int r = (int)(Math.random() * 6);
		if(r == 0) {
			d1.setTranslateX(500);
			d2.setTranslateX(500);
			d3.setTranslateX(500);
			d4.setTranslateX(500);
			d5.setTranslateX(500);
			d6.setTranslateX(500);
			d1.setTranslateY(60);
			d2.setTranslateY(60);
			d3.setTranslateY(60);
			d4.setTranslateY(60);
			d5.setTranslateY(60);
			d6.setTranslateY(60);
		}
		if(r == 1) {
			d1.setTranslateX(470);
			d2.setTranslateX(470);
			d3.setTranslateX(470);
			d4.setTranslateX(530);
			d5.setTranslateX(530);
			d6.setTranslateX(530);
			d1.setTranslateY(30);
			d2.setTranslateY(30);
			d3.setTranslateY(30);
			d4.setTranslateY(90);
			d5.setTranslateY(90);
			d6.setTranslateY(90);
		}
		if(r == 2) {
			d1.setTranslateX(470);
			d2.setTranslateX(470);
			d3.setTranslateX(500);
			d4.setTranslateX(500);
			d5.setTranslateX(530);
			d6.setTranslateX(530);
			d1.setTranslateY(30);
			d2.setTranslateY(30);
			d3.setTranslateY(60);
			d4.setTranslateY(60);
			d5.setTranslateY(90);
			d6.setTranslateY(90);
		}
		if(r == 3) {
			d1.setTranslateX(470);
			d2.setTranslateX(530);
			d3.setTranslateX(530);
			d4.setTranslateX(470);
			d5.setTranslateX(470);
			d6.setTranslateX(470);
			d1.setTranslateY(30);
			d2.setTranslateY(30);
			d3.setTranslateY(90);
			d4.setTranslateY(90);
			d5.setTranslateY(90);
			d6.setTranslateY(90);
		}
		if(r == 4) {
			d1.setTranslateX(470);
			d2.setTranslateX(530);
			d3.setTranslateX(530);
			d4.setTranslateX(470);
			d5.setTranslateX(500);
			d6.setTranslateX(500);
			d1.setTranslateY(30);
			d2.setTranslateY(30);
			d3.setTranslateY(90);
			d4.setTranslateY(90);
			d5.setTranslateY(60);
			d6.setTranslateY(60);
		}
		if(r == 5) {
			d1.setTranslateX(470);
			d2.setTranslateX(470);
			d3.setTranslateX(470);
			d4.setTranslateX(530);
			d5.setTranslateX(530);
			d6.setTranslateX(530);
			d1.setTranslateY(30);
			d2.setTranslateY(60);
			d3.setTranslateY(90);
			d4.setTranslateY(30);
			d5.setTranslateY(60);
			d6.setTranslateY(90);
		}
		if(p + r > limit) {
			r = 0;
		}
		p = p + r + 1;
		return p;
	}
	public void sizeS() {
		
		space1.setTranslateY(300);
		space2.setTranslateY(300);
		space3.setTranslateY(300);
		space4.setTranslateY(300);
		space5.setTranslateY(300);
		space6.setTranslateY(300);
		space7.setTranslateY(300);
		space8.setTranslateY(300);
		space9.setTranslateY(300);
		space10.setTranslateY(300);
		space2.setTranslateX(100);
		space3.setTranslateX(200);
		space4.setTranslateX(300);
		space5.setTranslateX(400);
		space6.setTranslateX(500);
		space7.setTranslateX(600);
		space8.setTranslateX(700);
		space9.setTranslateX(800);
		space10.setTranslateX(900);
	}
	public void sizeM() {
		space2.setTranslateY(100);
		space3.setTranslateY(200);
		space4.setTranslateY(300);
		space5.setTranslateY(400);
		space6.setTranslateY(500);
		space7.setTranslateY(580);
		space8.setTranslateY(580);
		space9.setTranslateY(580);
		space10.setTranslateY(500);
		space11.setTranslateY(400);
		space12.setTranslateY(300);
		space13.setTranslateY(200);
		space14.setTranslateY(100);
		space15.setTranslateY(0);
		space1.setTranslateX(80);
		space2.setTranslateX(80);
		space3.setTranslateX(80);
		space4.setTranslateX(80);
		space5.setTranslateX(80);
		space6.setTranslateX(80);
		space7.setTranslateX(240);
		space8.setTranslateX(460);
		space9.setTranslateX(700);
		space10.setTranslateX(840);
		space11.setTranslateX(840);
		space12.setTranslateX(840);
		space13.setTranslateX(840);
		space14.setTranslateX(840);
		space15.setTranslateX(840);
	}
	public void sizeL() {
		space2.setTranslateY(125);
		space3.setTranslateY(290);
		space4.setTranslateY(450);
		space5.setTranslateY(580);
		space6.setTranslateY(470);
		space7.setTranslateY(380);
		space8.setTranslateY(290);
		space9.setTranslateY(190);
		space10.setTranslateY(100);
		space11.setTranslateY(0);
		space12.setTranslateY(125);
		space13.setTranslateY(290);
		space14.setTranslateY(450);
		space15.setTranslateY(580);
		space16.setTranslateY(580);
		space17.setTranslateY(580);
		space18.setTranslateY(580);
		space19.setTranslateY(450);
		space20.setTranslateY(125);
		space2.setTranslateX(0);
		space3.setTranslateX(0);
		space4.setTranslateX(0);
		space5.setTranslateX(0);
		space6.setTranslateX(175);
		space7.setTranslateX(320);
		space8.setTranslateX(465);
		space9.setTranslateX(620);
		space10.setTranslateX(765);
		space11.setTranslateX(925);
		space12.setTranslateX(925);
		space13.setTranslateX(925);
		space14.setTranslateX(925);
		space15.setTranslateX(925);
		space16.setTranslateX(765);
		space17.setTranslateX(620);
		space18.setTranslateX(465);
		space19.setTranslateX(465);
		space20.setTranslateX(465);
	}
	public static void twoPlayer(Polygon space) {
		int i = 0;
		i = (int)(Math.random() * 2);
		if(i == 0) {
			space.setFill(Color.RED);
			space.setStroke(Color.BLACK);
		}
		else if(i == 1) {
			space.setFill(Color.BLUE);
			space.setStroke(Color.BLACK);
		}
	}
	public static void threePlayer(Polygon space) {
		int i = 0;
		i = (int)(Math.random() * 3);
		if(i == 0) {
			space.setFill(Color.RED);
			space.setStroke(Color.BLACK);
		}
		else if(i == 1) {
			space.setFill(Color.BLUE);
			space.setStroke(Color.BLACK);
		}
		else if(i == 2) {
			space.setFill(Color.YELLOW);
			space.setStroke(Color.BLACK);
		}
	}
	public static void fourPlayer(Polygon space) {
		int i = 0;
		i = (int)(Math.random() * 4);
		if(i == 0) {
			space.setFill(Color.RED);
			space.setStroke(Color.BLACK);
		}
		else if(i == 1) {
			space.setFill(Color.BLUE);
			space.setStroke(Color.BLACK);
		}
		else if(i == 2) {
			space.setFill(Color.YELLOW);
			space.setStroke(Color.BLACK);
		}
		else if(i == 3) {
			space.setFill(Color.GREEN);
			space.setStroke(Color.BLACK);
		}
	}
	public void redSpace() {
		int r = (int)(Math.random() * 11);
		R = true;
		String[] list = new String[11];
		list[0] = "Throw a paper ball into a trashbin backwards(3 attempts)";
		list[1] = "Write the alphabet with one hand, eyes closed, while staying on the line";
		list[2] = "Balance a pencil/pen on your finger for 5 seconds verticaly(3 attempts)";
		list[3] = "Pick a word you're not too familier with and spell it, then check for correct spelling";
		list[4] = "Find an object that is Blue(no repeats)";
		list[5] = "Find an object that is Red(no repeats)";
		list[6] = "Find an object that is Green(no repeats)";
		list[7] = "Find an object that is Yellow(no repeats)";
		list[8] = "Find an object that is Black(no repeats)";
		list[9] = "Find an object that is White(no repeats)";
		list[10] = "Pick an object\nSell its concept as an idea for a product without stuttering or pausing for more than 3 seconds";
		prompt = list[r];
		taskSpace.clear();
		taskSpace.setText(prompt);
		task();
	}
	public void blueSpace() {
		int r = (int)(Math.random() * 9);
		B = true;
		String[] list = new String[10];
		list[0] = "Rock,Paper,Scissors with another player(2 out of 3)";
		list[1] = "Pick a word, write with your off hand\ncompare neatness against another player who does the same";
		list[2] = "Pick a player and hit a paper ball in a rally\nWinner the last one to hit the ball before it hits the floor";
		list[3] = "Tic,Tac,Toe with another player";
		list[4] = "Thumb War with another player";
		list[5] = "Kick a paper field goal between another player's hands";
		list[6] = "Prepare to and balance on one foot longer than another player";
		list[7] = "Staring contest with player of choice(Keeping a straight face is required)\nOthers are encouraged to disrupt one player at a time(No touching)";
		list[8] = "Roll a paper ball into a \"bullseye\" area\nPlayer closest to the center wins";
		prompt = list[r];
		taskSpace.clear();
		taskSpace.setText(prompt);
		task();
	}
	public void yellowSpace() {
		int r = (int)(Math.random() * 6);
		Y = true;
		String[] list = new String[6];
		list[0] = "1 vs 2 arm wrestle, don't get pinned within 3 seconds";
		list[1] = "Landing player must dodge two players throwing paper balls with 3 throws each\nNo blocking or catching";
		list[2] = "Pick two players and give a handshake with eyes closed\nGuess the order of hand shakes to players";
		list[3] = "Hangman, Landing player picks a word between 4-8 letters";
		list[4] = "Hangman, 2 players pick a word 4 letters long\nThree misses for landing player";
		list[5] = "Set up a goal space\nLanding player must get a paper ball through two goalies once to win(3 attempts)";
		prompt = list[r];
		taskSpace.clear();
		taskSpace.setText(prompt);
		task();
	}
	public void greenSpace() {
		int r = (int)(Math.random() * 6);
		G = true;
		String[] list = new String[6];
		list[0] = "Pick a topic and choose five words that describe it\nEveryone picks a word\nLanding player loses if anyone matches";
		list[1] = "Pick a topic and ask a trivia question with choices\nWin if no one is correct";
		list[2] = "Hangman, Landing player picks a word 6-10 letters long";
		list[3] = "2 vs 2 rock paper scissors\nIf the landing player's team wins\nThe player on landing player's team gets one free red or blue space success";
		list[4] = "Pick a number between 0-15\nIf no one is 3 numbers within the landing players pick, landing player wins";
		list[5] = "Landing player picks a teammate\nEach member rolls a paper ball into a \"bullseye\"\nTeam closest overall to the center wins\nLanding player's teammate gets a free red or blue space success for winning";
		prompt = list[r];
		taskSpace.clear();
		taskSpace.setText(prompt);
		task();
	}
	public int task() {
		bonus = 0;
		roll.setDisable(true);
		pane.getChildren().add(taskSpace);
		taskSpace.setEditable(false);
		pane.getChildren().addAll(success,failure);
		
		success.setOnAction(e -> {
			if(R == true) {
				bonus = 1;
				R = false;
				if(player1T == true) {
				
				if(p1 + bonus > limit) {
					p1 = limit;
					System.out.print(limit);
					player1T =false;
					player2T = true;
					bSteps = false;
					travel(pawn1, p1);
					if(playerNum == 2) {
						turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
					}
					else if(playerNum == 3) {
						turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
					}
					else {
						turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
					}
				}
				
				else {
					p1 = p1 + bonus;
					player1T =false;
					player2T = true;
					bSteps = false;
					travel(pawn1, p1);
					if(playerNum == 2) {
						turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
					}
					else if(playerNum == 3) {
						turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
					}
					else {
						turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
					}
				}
				}
				else if(player2T == true) {
					
					 if(p2 + bonus > limit) {
						p2 = limit;
						player2T =false;
						if(playerNum >= 3) {
							player3T = true;
						}
						else {
							player1T = true;
						}
						bSteps = false;
						travel(pawn2, p2);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					else {
						p2 = p2 + bonus;
						player2T =false;
						if(playerNum >= 3) {
							player3T = true;
						}
						else {
							player1T = true;
						}
						bSteps = false;
						travel(pawn2, p2);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
				else if(player3T == true) {
					
					 if(p3 + bonus > limit) {
						p3 = limit;
						player3T =false;
						if(playerNum == 4) {
							player4T = true;
						}
						else {
							player1T = true;
						}
						bSteps = false;
						travel(pawn3, p3);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					else {
						p3 = p3 + bonus;
						player3T =false;
						if(playerNum == 4) {
							player4T = true;
						}
						else {
							player1T = true;
						}
						bSteps = false;
						travel(pawn3, p3);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
				else if(player4T == true) {
					
					 if(p4 + bonus > limit) {
						p4 = limit;
						player4T =false;
						player1T = true;
						bSteps = false;
						travel(pawn4, p4);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					else {
						p4 = p4 + bonus;
						player4T =false;
						player1T = true;
						bSteps = false;
						travel(pawn4, p4);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
			}
			else if(B == true) {
				bonus = 2;
				B = false;
				if(player1T == true) {
					
				 if(p1 + bonus > limit) {
						p1 = limit;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					else {
						p1 = p1 + bonus;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
					else if(player2T == true) {
						
						 if(p2 + bonus > limit) {
							p2 = limit;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p2 = p2 + bonus;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player3T == true) {
						
						 if(p3 + bonus > limit) {
							p3 = limit;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p3 = p3 + bonus;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player4T == true) {
					
						 if(p4 + bonus > limit) {
							p4 = limit;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p4 = p4 + bonus;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
			}
			else if(Y == true) {
				bonus = 3;
				Y = false;
				if(player1T == true) {
					
					 if(p1 + bonus > limit) {
						p1 = limit;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					else {
						p1 = p1 + bonus;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
					else if(player2T == true) {
						
						 if(p2 + bonus > limit) {
							p2 = limit;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p2 = p2 + bonus;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player3T == true) {
						
						 if(p3 + bonus > limit) {
							p3 = limit;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p3 = p3 + bonus;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player4T == true) {
						
						if(p4 + bonus > limit) {
							p4 = limit;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p4 = p4 + bonus;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
			}
			else if(G == true) {
				bonus = 4;
				G = false;
				if(player1T == true) {
					
					 if(p1 + bonus > limit) {
						p1 = limit;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					else {
						p1 = p1 + bonus;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
					else if(player2T == true) {
						
						 if(p2 + bonus > limit) {
							p2 = limit;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p2 = p2 + bonus;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player3T == true) {
						
						 if(p3 + bonus > limit) {
							p3 = limit;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p3 = p3 + bonus;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player4T == true) {
						
						 if(p4 + bonus > limit) {
							p4 = limit;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						else {
							p4 = p4 + bonus;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
			}
			
			pane.getChildren().removeAll(taskSpace,success,failure);
			roll.setDisable(false);
			
		
		});
		
		
		failure.setOnAction(e -> {
			if(R == true) {
				bonus = -1;
				R = false;
				if(player1T == true) {
					if(p1 + bonus < 1) {
						p1 = 1;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					
					else {
						p1 = p1 + bonus;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
					else if(player2T == true) {
						if(p2 + bonus < 1) {
							p2 = 1;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p2 = p2 + bonus;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player3T == true) {
						if(p3 + bonus < 1) {
							p3 = 1;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p3 = p3 + bonus;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player4T == true) {
						if(p4 + bonus < 1) {
							p4 = 1;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p4 = p4 + bonus;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
			}
			else if(B == true) {
				bonus = -1;
				B = false;
				if(player1T == true) {
					if(p1 + bonus < 1) {
						p1 = 1;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					
					else {
						p1 = p1 + bonus;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
					else if(player2T == true) {
						if(p2 + bonus < 1) {
							p2 = 1;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p2 = p2 + bonus;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player3T == true) {
						if(p3 + bonus < 1) {
							p3 = 1;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p3 = p3 + bonus;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player4T == true) {
						if(p4 + bonus < 1) {
							p4 = 1;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p4 = p4 + bonus;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
			}
			else if(Y == true) {
				bonus = -2;
				Y = false;
				if(player1T == true) {
					if(p1 + bonus < 1) {
						p1 = 1;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					
					else {
						p1 = p1 + bonus;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
					else if(player2T == true) {
						if(p2 + bonus < 1) {
							p2 = 1;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p2 = p2 + bonus;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player3T == true) {
						if(p3 + bonus < 1) {
							p3 = 1;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p3 = p3 + bonus;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player4T == true) {
						if(p4 + bonus < 1) {
							p4 = 1;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p4 = p4 + bonus;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
			}
			else if(G == true) {
				bonus = -2;
				G = false;
				if(player1T == true) {
					if(p1 + bonus < 1) {
						p1 = 1;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					
					else {
						p1 = p1 + bonus;
						player1T =false;
						player2T = true;
						bSteps = false;
						travel(pawn1, p1);
						if(playerNum == 2) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
						}
						else if(playerNum == 3) {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
						}
						else {
							turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
						}
					}
					}
					else if(player2T == true) {
						if(p2 + bonus < 1) {
							p2 = 1;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p2 = p2 + bonus;
							player2T =false;
							if(playerNum >= 3) {
								player3T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn2, p2);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player3T == true) {
						if(p3 + bonus < 1) {
							p3 = 1;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
					
						else {
							p3 = p3 + bonus;
							player3T =false;
							if(playerNum == 4) {
								player4T = true;
							}
							else {
								player1T = true;
							}
							bSteps = false;
							travel(pawn3, p3);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
					else if(player4T == true) {
						if(p4 + bonus < 1) {
							p4 = 1;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						
						else {
							p4 = p4 + bonus;
							player4T =false;
							player1T = true;
							bSteps = false;
							travel(pawn4, p4);
							if(playerNum == 2) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2);
							}
							else if(playerNum == 3) {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3);
							}
							else {
								turnOrder.setText(Player1 + " - " + p1 + "  " +Player2+ " - "+ p2 +"  "+Player3 +" - "+ p3 + " " + Player4 + " - " + p4);
							}
						}
						}
			}
			pane.getChildren().removeAll(taskSpace,success,failure);
			roll.setDisable(false);
			
		});
		return bonus;
		
	}
	public void turnOrder() {
		if(playerNum == 2) {
		p1T = (int)((Math.random()* 2) + 1);
		p2T = (int)((Math.random()* 2) + 1);
		if(p2T == p1T) {
			while(p2T == p1T) {
				p2T = (int)((Math.random()* 2) + 1);
			}
		}
		}
		if(playerNum == 3) {
		p1T = (int)((Math.random()* 3) + 1);
		p2T = (int)((Math.random()* 3) + 1);
		p3T = (int)((Math.random()* 3) + 1);
		if(p2T == p1T) {
			while(p2T == p1T) {
				p2T = (int)((Math.random()* 3) + 1);
			}
		}
		if(p3T == p1T || p3T == p2T) {
			while(p3T == p1T || p3T == p2T) {
				p3T = (int)((Math.random()* 3) + 1);
			}
		}
		}
		if(playerNum == 4) {
		p1T = (int)((Math.random()* 4) + 1);
		p2T = (int)((Math.random()* 4) + 1);
		p3T = (int)((Math.random()* 4) + 1);	
		p4T = (int)((Math.random()* 4) + 1);
		if(p2T == p1T) {
			while(p2T == p1T) {
				p2T = (int)((Math.random()* 4) + 1);
			}
		}
		if(p3T == p1T || p3T == p2T) {
			while(p3T == p1T || p3T == p2T) {
				p3T = (int)((Math.random()* 4) + 1);
			}
		}
		if(p4T == p1T || p4T == p2T || p4T == p3T) {
			while(p4T == p1T || p4T == p2T || p4T == p3T) {
				p4T = (int)((Math.random()* 4) + 1);
			}
		}
		}
		if(p1T == 1) {
			Player1 = name1;
		}
		else if(p1T == 2) {
			Player2 = name1;
		}
		else if(p1T == 3) {
			Player3 = name1;
		}
		else if(p1T == 4) {
			Player4 = name1;
		}
		if(p2T == 1) {
			Player1 = name2;
		}
		else if(p2T == 2) {
			Player2 = name2;
		}
		else if(p2T == 3) {
			Player3 = name2;
		}
		else if(p2T == 4) {
			Player4 = name2;
		}
		if(playerNum >= 3) {
		if(p3T == 1) {
			Player1 = name3;
		}
		else if(p3T == 2) {
			Player2 = name3;
		}
		else if(p3T == 3) {
			Player3 = name3;
		}
		else if(p3T == 4) {
			Player4 = name3;
		}
		}
		if(playerNum == 4) {
		if(p4T == 1) {
			Player1 = name4;
		}
		else if(p4T == 2) {
			Player2 = name4;
		}
		else if(p4T == 3) {
			Player3 = name4;
		}
		else if(p4T == 4) {
			Player4 = name4;
		}
		}
	}
	public void travel(Rectangle pawn, int p) {
			if(p == 1) {
				pawn.setTranslateX(space1.getTranslateX() + 14);
				pawn.setTranslateY(space1.getTranslateY() - 20);
			}
			if(p == 2) {
				pawn.setTranslateX(space2.getTranslateX() + 14);
				pawn.setTranslateY(space2.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space2);
			}
			if(p == 3) {
				pawn.setTranslateX(space3.getTranslateX() + 14);
				pawn.setTranslateY(space3.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space3);
			}
			if(p == 4) {
				pawn.setTranslateX(space4.getTranslateX() + 14);
				pawn.setTranslateY(space4.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space4);
			}
			if(p == 5) {
				pawn.setTranslateX(space5.getTranslateX() + 14);
				pawn.setTranslateY(space5.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space5);
			}
			if(p == 6) {
				pawn.setTranslateX(space6.getTranslateX() + 14);
				pawn.setTranslateY(space6.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space6);
			}
			if(p == 7) {
				pawn.setTranslateX(space7.getTranslateX() + 14);
				pawn.setTranslateY(space7.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space7);
			}
			if(p == 8) {
				pawn.setTranslateX(space8.getTranslateX() + 14);
				pawn.setTranslateY(space8.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space8);
			}
			if(p == 9) {
				pawn.setTranslateX(space9.getTranslateX() + 14);
				pawn.setTranslateY(space9.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space9);
			}
			if(p == 10) {
				pawn.setTranslateX(space10.getTranslateX() + 14);
				pawn.setTranslateY(space10.getTranslateY() - 20);
				if(bSteps == true && limit != 10) {
				colorCheck(space10);
				}
				else {
					System.out.print(limit);
					if(p1 >= 10) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player1 + " is the Winner!!");
					}
					else if(p2 >= 10) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player2 + " is the Winner!!");
					}
					else if(p3 >= 10) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player3 + " is the Winner!!");
					}
					else if(p4 >= 10) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player4 + " is the Winner!!");
					}
				}
			}
			if(p == 11) {
				pawn.setTranslateX(space11.getTranslateX() + 14);
				pawn.setTranslateY(space11.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space11);
			}
			if(p == 12) {
				pawn.setTranslateX(space12.getTranslateX() + 14);
				pawn.setTranslateY(space12.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space12);
			}
			if(p == 13) {
				pawn.setTranslateX(space13.getTranslateX() + 14);
				pawn.setTranslateY(space13.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space13);
			}
			if(p == 14) {
				pawn.setTranslateX(space14.getTranslateX() + 14);
				pawn.setTranslateY(space14.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space14);
			}
			if(p == 15) {
				pawn.setTranslateX(space15.getTranslateX() + 14);
				pawn.setTranslateY(space15.getTranslateY() - 20);
				if(bSteps == true && limit != 15)
				colorCheck(space15);
				else {
					if(p1 >= 15) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player1 + " is the Winner!!");
					}
					else if(p2 >= 15) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player2 + " is the Winner!!");
					}
					else if(p3 >= 15) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player3 + " is the Winner!!");
					}
					else if(p4 >= 15) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player4 + " is the Winner!!");
					}
				}
			}
			if(p == 16) {
				pawn.setTranslateX(space16.getTranslateX() + 14);
				pawn.setTranslateY(space16.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space16);
			}
			if(p == 17) {
				pawn.setTranslateX(space17.getTranslateX() + 14);
				pawn.setTranslateY(space17.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space17);
			}
			if(p == 18) {
				pawn.setTranslateX(space18.getTranslateX() + 14);
				pawn.setTranslateY(space18.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space18);
			}
			if(p == 19) {
				pawn.setTranslateX(space19.getTranslateX() + 14);
				pawn.setTranslateY(space19.getTranslateY() - 20);
				if(bSteps == true)
				colorCheck(space19);
			}
			if(p >= 20) {
				pawn.setTranslateX(space20.getTranslateX() + 14);
				pawn.setTranslateY(space20.getTranslateY() - 20);
					if(p1 >= 20) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player1 + " is the Winner!!");
					}
					else if(p2 >= 20) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player2 + " is the Winner!!");
					}
					else if(p3 >= 20) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player3 + " is the Winner!!");
					}
					else if(p4 >= 20) {
						pane.getChildren().remove(taskSpace);
						pane.getChildren().add(taskSpace);
						roll.setDisable(true);
						taskSpace.setText(Player4 + " is the Winner!!");
					}
				
			}
	}
	public void colorCheck(Polygon space) {
		if(space.getFill() == Color.RED){
			redSpace();
		}
		else if(space.getFill() == Color.BLUE){
			blueSpace();
		}
		else if(space.getFill() == Color.YELLOW){
			yellowSpace();
		}
		else if(space.getFill() == Color.GREEN){
			greenSpace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}