/** @author it21578 */
package eticket;

import Lines.Line;
import Methods.Method;
import Stations.Station;
import Stops.Stop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ETicket {
    
    
    
    
    public static void main(String[] args)throws Exception {
        
        
        
        
        
        Scanner scn = new Scanner(System.in);		//scanner για την εισοδο δεδομενων
        String usrStation = null;		//επιλογη του χρηστη για τον σταθμο
        String usrLine = null;			//επιλογη του χρηστη για την γραμμη
        String usrStop = null;			//επιλογη του χρηστη για την σταση
        boolean found = false;			//μια μεταβλητη για να επιβεβαιωνω καποιους ελεγχους
        boolean back = false;           //μια μεταβλητη για να παει πισω βημα το προγραμμα
        boolean menuSel = false;        //μια μεταβλητη για τον ελεγχο του μενου
        int menuFrsT = 0;                   //μια μεταβλητη για το αν ειναι η πρωτη φορα που δοκιμαζει ο χρηστης
        int frsT = 0;			// μια μεταβλητη για το αν ειναι η πρωτη φορα που δοκιμαζει ο χρηστης
        String usrStartingLine = null ;		//μια μεταβλητη για την αρχικη γραμμη του χρηστη
        String usrStartingStop = null ;		//μια μεταβλητη για την αρχικη σταση του χρηστη
        String usrDestLine = null ;		//μια μεταβλητη για την γραμμη που θελει να παει ο χρηστης
        String usrDestStop = null ;		//μια μεταβλητη για την σταση που θελει να παει ο χρηστης
        String option;			//μια μεταβλητη για την επιλογη του χρηστη στο μενου
        int time = 0;			//μια μεταβλητη για την ωρα που χρειαζεται ο χρηστης να μεταφερθει
        String cut = " ";		//μια μεταλητη για να κοβω το περιεχομενο της προτασης μετα την πρωτη λεξη
        
        List<Station> listStations = new ArrayList<>();		// λιστα για τους σταθμους
        
        List<Stop> listStops = new ArrayList<>();		//λιστα για τις στασεις
        List<Stop> listSelectedStops = new ArrayList<>();	//λιστα για τις επιλεγμενες στασεις που θα προταθουν
        List<Stop> listForStopResults = new ArrayList<>();	//λιστα για να βγαλω το αποτελεσμα της ωρας που παιρνει το μετρο
        
        List<Line> listLines = new ArrayList<>();	//λιστα για τις γραμμες
        
        /*δημιουργια των γραμμων,στασεων και σταθμων ως αντικειμενα καθως δεν γνωριζω πως να συνδεσω το excel και να το διαβασω απευθειας 
        και ρωτησα με γραπτο email εσας και μου ειπε ο κυριος Χρηστος Κοτρωνης οτι δεν υπαρχει θεμα καθως και εβαλα μονο 2 γραμμες αφου δεν υπηρχε θεμα
        παλι με την υποδειξη του διδασκοντα αφου καλυπτει τα σεναρια της ασκησης.*/
        

        Line line2 = new Line("Line 2 - Elliniko - Anthoupoli",2,300);
        Line line3 = new Line("Line 3 - Doukissis Plakentias - Aghia Marina",3,300);
        
        //δημιουργουμε ολους τους σταθμους και τις στασεις σαν objects

        
        Station station201 = new Station("Anthoupoli", 1 , 2);
        Station station202 = new Station("Peristeri", 2 , 2);
        Station station203 = new Station("Aghios Antonios", 2 , 2);
        Station station204 = new Station("Sepolia", 2 , 2);
        Station station205 = new Station("Attiki", 3 , 2);
        Station station206 = new Station("Larissa Station", 2 , 2);
        Station station207 = new Station("Metaxourghio", 2 , 2);
        Station station208 = new Station("Omonia", 3 , 2);
        Station station209 = new Station("Panepistimio", 2 , 2);
        Station station210 = new Station("Syntagma", 3 , 2);
        Station station211 = new Station("Acropoli", 2 , 2);
        Station station212 = new Station("Syngrou - Fix", 2 , 2);
        Station station213 = new Station("Neos Kosmos", 2 , 2);
        Station station214 = new Station("Aghios Ioannis", 2 , 2);
        Station station215 = new Station("Dafni", 2 , 2);
        Station station216 = new Station("Aghios Dimitrios", 2 , 2);
        Station station217 = new Station("Ilioupoli", 2 , 2);
        Station station218 = new Station("Alimos", 2 , 2);
        Station station219 = new Station("Argyroupoli", 2 , 2);
        Station station220 = new Station("Elliniko", 1 , 2);
        
        
        Station station301 = new Station("Aghia Marina",1,3); 
        Station station302 = new Station("Egaleo", 2 , 3);
        Station station303 = new Station("Eleonas", 2 , 3);  
        Station station304 = new Station("Kerameikos", 2 , 3);
        Station station305 = new Station("Monastiraki", 3 , 3);
        Station station306 = new Station("Syntagma", 3 , 3);
        Station station307 = new Station("Evangelismos", 2 , 3);
        Station station308 = new Station("Megaro Moussikis", 2 , 3);
        Station station309 = new Station("Ambelokipoi", 2 , 3);
        Station station310 = new Station("Panormou", 2 , 3);
        Station station311 = new Station("Katehaki", 2 , 3);
        Station station312 = new Station("Ethniki Amyna",2,3);
        Station station313 = new Station("Holargos", 2 , 3);
        Station station314 = new Station("Nomismatokopio", 2 , 3);
        Station station315 = new Station("Aghia Paraskevi", 2 , 3);
        Station station316 = new Station("Halandri", 2 , 3);
        Station station317 = new Station("Doukissis Plakentias", 1 , 3);

        
        
        Stop stop201 = new Stop("Anthoupoli L2",2,0,120,120,1);
        Stop stop202 = new Stop("Peristeri L2",2,120,120,60,2);
        Stop stop203 = new Stop("Aghios Antonios L2",2,120,60,30,2);
        Stop stop204 = new Stop("Sepolia L2",2,60,60,30,2);
        Stop stop205 = new Stop("Attiki L2",2,60,60,60,2);
        Stop stop206 = new Stop("Larissa Station L2",2,60,120,60,2);
        Stop stop207 = new Stop("Metaxourghio L2",2,120,120,30,2);
        Stop stop208 = new Stop("Omonia L2",2,120,120,60,2);
        Stop stop209 = new Stop("Panepistimio L2",2,120,60,30,2);
        Stop stop210 = new Stop("Syntagma L2",2,60,120,120,3);
        Stop stop211 = new Stop("Acropoli L2",2,120,60,60,2);
        Stop stop212 = new Stop("Syngrou - Fix L2",2,60,120,30,2);
        Stop stop213 = new Stop("Neos Kosmos L2",2,120,60,30,2);
        Stop stop214 = new Stop("Aghios Ioannis L2",2,60,120,30,2);
        Stop stop215 = new Stop("Dafni L2",2,120,120,30,2);
        Stop stop216 = new Stop("Aghios Dimitrios L2",2,120,120,30,2);
        Stop stop217 = new Stop("Ilioupoli L2",2,120,120,30,2);
        Stop stop218 = new Stop("Alimos L2",2,120,60,30,2);
        Stop stop219 = new Stop("Argyroupoli L2",2,60,60,30,2);
        Stop stop220 = new Stop("Elliniko L2",2,60,0,180,1);
        
        Stop stop301 = new Stop("Aghia Marina L3",3,0,120,120,1);
        Stop stop302 = new Stop("Egaleo L3",3,120,120,60,2);
        Stop stop303 = new Stop("Eleonas L3",3,120,120,30,2);
        Stop stop304 = new Stop("Kerameikos L3",3,120,120,30,2);                
        Stop stop305 = new Stop("Monastiraki L3",3,120,120,30,2);
        Stop stop306 = new Stop("Syntagma L3",3,120,120,120,3);
        Stop stop307 = new Stop("Evangelismos L3",3,120,60,30,2);
        Stop stop308 = new Stop("Megaro Moussikis L3",3,60,120,30,2);
        Stop stop309 = new Stop("Ambelokipi L3",3,120,180,30,2);
        Stop stop310 = new Stop("Panormou L3",3,180,120,30,2);
        Stop stop311 = new Stop("Katehaki L3",3,120,120,30,2);
        Stop stop312 = new Stop("Ethniki Amyna L3",3,120,120,30,2);
        Stop stop313 = new Stop("Holargos L3",3,120,60,30,2);
        Stop stop314 = new Stop("Nomismatokopio L3",3,60,120,30,2);
        Stop stop315 = new Stop("Aghia Paraskevi L3",3,120,60,30,2);
        Stop stop316 = new Stop("Halandri L3",3,60,30,30,2);
        Stop stop317 = new Stop("Doukissis Plakentias L3",3,30,0,120,1);

        //Προσθηκη των αντικειμενων στις αντιστοιχες λιστες.

        listLines.add(line2);
        listLines.add(line3);
            
        listStops.add(stop201);
        listStops.add(stop202);
        listStops.add(stop203);
        listStops.add(stop204);
        listStops.add(stop205);
        listStops.add(stop206);
        listStops.add(stop207);
        listStops.add(stop208);
        listStops.add(stop209);
        listStops.add(stop210);
        listStops.add(stop211);
        listStops.add(stop212);
        listStops.add(stop213);
        listStops.add(stop214);
        listStops.add(stop215);
        listStops.add(stop216);
        listStops.add(stop217);
        listStops.add(stop218);
        listStops.add(stop219);
        listStops.add(stop220);
        listStops.add(stop301);
        listStops.add(stop302);
        listStops.add(stop303);
        listStops.add(stop304);
        listStops.add(stop305);
        listStops.add(stop306);
        listStops.add(stop307);
        listStops.add(stop308);
        listStops.add(stop309);
        listStops.add(stop310);
        listStops.add(stop311);
        listStops.add(stop312);
        listStops.add(stop313);
        listStops.add(stop314);
        listStops.add(stop315);
        listStops.add(stop316);
        listStops.add(stop317);

        listStations.add(station201); 
        listStations.add(station202); 
        listStations.add(station203); 
        listStations.add(station204);
        listStations.add(station205);
        listStations.add(station206); 
        listStations.add(station207); 
        listStations.add(station208); 
        listStations.add(station209); 
        listStations.add(station210); 
        listStations.add(station211); 
        listStations.add(station212);
        listStations.add(station213); 
        listStations.add(station214); 
        listStations.add(station215); 
        listStations.add(station216);
        listStations.add(station217); 
        listStations.add(station218); 
        listStations.add(station219); 
        listStations.add(station220);
        listStations.add(station301); 
        listStations.add(station302); 
        listStations.add(station303); 
        listStations.add(station304);
        listStations.add(station305); 
        listStations.add(station306); 
        listStations.add(station307); 
        listStations.add(station308);
        listStations.add(station309); 
        listStations.add(station310);
        listStations.add(station311); 
        listStations.add(station312);
        listStations.add(station313);
        listStations.add(station314);
        listStations.add(station315); 
        listStations.add(station316);
        listStations.add(station317);
        
        //ΑΡΧΗ ΤΟΥ ΠΡΟΓΡΑΜΜΑΤΟΣ ----------------------------------------------------------------------------------------------------------------
        
        System.out.println("Press 1 to check for any info of the trailway stations."
                + " Press 2 to check a specific stop. Press 3 to check the approximated time it will take you to go for a X place to Y place.");
        
        do{
            // menuFrsT και frsT χρεισημοποιουνται ωστε να βγαλουμε το μνμα για να εισαγει ο χρηστης ξανα δεδομενα
            if (menuFrsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
            option = scn.nextLine();
            switch (option){
                                //Πρωτη περιπτωση ειναι η ασκηση 1(α)
                case "1" :

                    menuSel = true;     //η μεταβλητη παιρνει τιμη ωστε να προσπερασει τον ελεγχο του μενου
                    
                    System.out.println("Please select a line\nLine 2\nLine 3");
                    frsT = 0;
                    // κανω ελεγχους για την εισοδο δεδομενων του χρηστη 
                    do{ 
                        found = false;
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrLine = Method.CapitalizeEachWord(scn.nextLine());        // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                        for (int i = 0; i <listLines.size();i++){
                            // κανω ελεγχο αν το ονομα της γραμμης περιεχει αυτο που εγραψε ο χρηστης η αν η γραμμη εχει το ιδιο νουμερο με αυτο που εγραψε ο χρηστης. Αν ειναι αδειο η αν περιεχει την λεξη line δεν περναει
                            if ( ( ( listLines.get(i).getLineName().contains(usrLine) || String.valueOf(listLines.get(i).getLineID()).contains(usrLine) ) && ( ( !usrLine.matches("Line")) && !usrLine.isEmpty() ) ) ){
                                System.out.println(listLines.get(i).toString());
                                usrLine = String.valueOf(listLines.get(i).getLineID()); // βαζω το νουμερο της γραμμης ως στρινγκ στην μεταβλητη για χρηση παρακατω
                                found = true;
                                System.out.println("And is consisted of these stations");
                                for (int j = 0; j < listStations.size();j++){
                                    if ( listStations.get(j).getStationLine() == listLines.get(i).getLineID() )  //ελεγχος της λιστας σταθμων με την λιστα γραμμης για το αν εχουν ιδια γραμμη
                                        System.out.println(listStations.get(j).stathmoi()); 
                                }
                            }
                        }
                        frsT = 1;
                    }while(found == false);

                    System.out.println("Select one of the above stations for more information");
                    frsT = 0;
                    do{ 
                        found = false;
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrStation = Method.CapitalizeEachWord(scn.nextLine()); // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                        for (int i = 0; i < listStations.size(); i++){
                            // κανω ελεγχο αν το ονομα του σταθμου περιεχει αυτο που εγραψε ο χρηστης η και οτι η γραμμη πρεπει να ειναι ιδια. Αν ειναι αδειο δεν περναει
                            if ( ( ( String.valueOf(listStations.get(i).getStationLine()).equals(usrLine) ) && ( listStations.get(i).getStationName().contains(usrStation) ) && ( !usrStation.isEmpty() ) ) ){
                                System.out.println(listStations.get(i).toString());
                                found = true;
                                System.out.println("And is consisted of that/these Stop/s ");
                                for (int j = 0; j < listStops.size(); j++){
                                    if ( listStops.get(j).getStopName().contains(usrStation)){
                                        System.out.println(listStops.get(j).stops());
                                    }
                                }  
                            }
                        }
                        frsT = 1;
                        
                    }while(found == false);

                    System.out.println("Select one the above stop/s for more information");
                    frsT = 0;
                    do{ 
                        found = false;
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrStop = Method.CapitalizeEachWord(scn.nextLine());      // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                        for (int i = 0; i < listStops.size(); i++){
                            // κανω ελεγχο αν το ονομα της στασης περιεχει αυτο που εγραψε ο χρηστης η και οτι το ονομα στασης περιεχει το ονομα σταθμου. Αν ειναι αδειο δεν περναει
                            if ( ( listStops.get(i).getStopName().contains(usrStop) ) && ( listStops.get(i).getStopName().contains(usrStation) ) && (!usrStop.isEmpty() ) ){
                                System.out.println(listStops.get(i).toString());
                                found = true;
                            }
                        }
                        frsT =1;
                    }while(found == false);

                    break;

                case "2" :  
                    //Δευτερη περιπτωση ειναι η ασκηση 1(β)
                    menuSel = true;

                    System.out.println("Type the stops you want to find");
                            // οσο το προγραμμα δεν μπορει να βρει καποιο κοντινο ονομα με αυτο που πληκτρολογησε ο χρηστης
                        frsT = 0;
                        do{

                            found = false;
                            if (frsT == 1)
                                System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                            usrStop = Method.CapitalizeEachWord(scn.nextLine());     // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                            for (int i = 0; i < listStops.size(); i++){
                                if ( listStops.get(i).getStopName().contains(usrStop) ){
                                    System.out.println("Did you mean this? " + listStops.get(i).getStopName());
                                    listSelectedStops.add(listStops.get(i));        // γεμιζω μια λιστα με οσα περιεχουν αυτο που εχει γραψει ο χρηστης μεσα στο ονομα τους.
                                    found = true;
                                }
                            }
                            frsT = 1;
                        }while(found == false);
                            // προτεινω καποιους σταθμους που
                        System.out.println("Type one of the above");
                        do{
                            found = false;
                            if (frsT == 1)
                                System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                            usrStop = Method.CapitalizeEachWord(scn.nextLine());         // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                            for (int i = 0; i < listSelectedStops.size(); i++){
                                if ( listSelectedStops.get(i).getStopName().contains(usrStop) ){
                                    System.out.println(listSelectedStops.get(i).toString());
                                    found = true;
                                }
                            }
                            
                        }while(found == false);

                    break;

                case "3" :  

                        //Τριτη περιπτωση ειναι η ασκηση 2.
                    
                    menuSel = true;
                    System.out.println("Type the starting line");
                    frsT = 0;
                    //στις επομενες γραμμες κανω εναν ελεγχο ωστε να μην περναει λαθος δεδομενα απο τον χρηστη και να ζητειται ξανα απο τον χρηστη
                    do{

                        found = false;
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrStartingLine = Method.CapitalizeEachWord(scn.nextLine());        // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 

                        for (int i = 0 ; i < listLines.size(); i++){
                            
                            if ( ( listLines.get(i).getLineName().contains(usrStartingLine) || String.valueOf(listLines.get(i).getLineID()).contains(usrStartingLine) )  && ( !usrStartingLine.matches("Line") && !usrStartingLine.isEmpty() ) ){
                                usrStartingLine = String.valueOf(listLines.get(i).getLineID());
                                found = true;
                            }   
                        }
                        frsT = 1;
                    }while(found == false);

                    frsT = 0;
                    found = false;
                    System.out.println("Type the starting stop");    
                    //στις επομενες γραμμες κανω εναν ελεγχο ωστε να μην περναει λαθος δεδομενα απο τον χρηστη και να ζητειται ξανα απο τον χρηστη
                    do{
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrStartingStop = Method.CapitalizeEachWord(scn.nextLine());        // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                        for (int i = 0; i < listStops.size(); i++){
                            if ( listStops.get(i).getStopName().contains(usrStartingStop) && usrStartingLine.contains(String.valueOf(listStops.get(i).getLineID()) )&& !usrStartingStop.isEmpty() ){
                                System.out.println("Did you mean this? " + listStops.get(i).getStopName());
                                listSelectedStops.add(listStops.get(i));
                                found = true;
                            }
                        }
                        frsT = 1;
                    }while(found == false);

                    found = false;
                    frsT = 0;
                    System.out.println("Type one of the above");
                    //στις επομενες γραμμες κανω εναν ελεγχο ωστε να μην περναει λαθος δεδομενα απο τον χρηστη και να ζητειται ξανα απο τον χρηστη
                    do{
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrStartingStop = Method.CapitalizeEachWord(scn.nextLine() );        // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                        for (int i = 0; i < listSelectedStops.size(); i++){
                            if ( listSelectedStops.get(i).getStopName().contains(usrStartingStop) && usrStartingLine.contains(String.valueOf(listSelectedStops.get(i).getLineID()) )&& !usrStartingStop.isEmpty() ){
                                System.out.println(listSelectedStops.get(i).toString());
                                found = true;
                                usrStartingStop = listSelectedStops.get(i).getStopName();
                            }   
                        }
                    frsT = 1;
                    }while(found == false);


                    System.out.println("Type the destination line");
                    frsT = 0;
                    //στις επομενες γραμμες κανω εναν ελεγχο ωστε να μην περναει λαθος δεδομενα απο τον χρηστη και να ζητειται ξανα απο τον χρηστη
                    do{
                        found = false;
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrDestLine = Method.CapitalizeEachWord(scn.nextLine());         // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 

                        for (int i = 0 ; i < listLines.size(); i++){
                            if ( ( listLines.get(i).getLineName().contains(usrDestLine) || String.valueOf(listLines.get(i).getLineID()).contains(usrDestLine) )  && ( !usrDestLine.matches("Line") && !usrDestLine.isEmpty() ) ){
                                usrDestLine = String.valueOf(listLines.get(i).getLineID());
                                found = true;
                            }   
                        }
                        frsT = 1;
                    }while(found == false);


                    frsT = 0;
                    found = false;
                    System.out.println("Type the destination stop");   
                    //στις επομενες γραμμες κανω εναν ελεγχο ωστε να μην περναει λαθος δεδομενα απο τον χρηστη και να ζητειται ξανα απο τον χρηστη
                    do{
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrDestStop = Method.CapitalizeEachWord(scn.nextLine());         // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                        for (int i = 0; i < listStops.size(); i++){
                            if ( listStops.get(i).getStopName().contains(usrDestStop) && usrDestLine.contains(String.valueOf(listStops.get(i).getLineID()) )&& !usrDestStop.isEmpty() ){
                                System.out.println("Did you mean this? " + listStops.get(i).getStopName());
                                listSelectedStops.add(listStops.get(i));
                                found = true;
                            }
                        }
                        frsT = 1;
                    }while(found == false);

                    found = false;
                    frsT = 0;
                    System.out.println("Type one of the above");
                    //στις επομενες γραμμες κανω εναν ελεγχο ωστε να μην περναει λαθος δεδομενα απο τον χρηστη και να ζητειται ξανα απο τον χρηστη
                    do{
                        if (frsT == 1)
                            System.out.println("What you entered was incorect or it can not be matched. Please type again.");
                        usrDestStop = Method.CapitalizeEachWord(scn.nextLine() );        // χρεισιμοποιω την μεθοδο ωστε να μπορω να συγκρινω σωστα 
                        for (int i = 0; i < listSelectedStops.size(); i++){
                            if ( listSelectedStops.get(i).getStopName().contains(usrDestStop) && usrDestLine.contains(String.valueOf(listSelectedStops.get(i).getLineID()) )&& !usrDestStop.isEmpty() ){
                                System.out.println(listSelectedStops.get(i).toString());
                                found = true;
                                usrDestStop = listSelectedStops.get(i).getStopName();
                            }   
                        }
                    frsT = 1;
                    }while(found == false);

                        // εδω υλοποιω το ζητουμενο να βρεθει ο χρονος που χρειαζεται να μεταφερθει ο χρηστης απο την μια σταση στην αλλη
                    for (int strSt = 0; strSt < listStops.size();strSt++){
                        if ( usrStartingStop.equals(listStops.get(strSt).getStopName() ) ) {
                            for (int dstSt = 0; dstSt < listStops.size();dstSt++){
                                if (usrDestStop.contains(listStops.get(dstSt).getStopName())) {
                                    // σε αυτη την if ξεχωριζω αν ειναι 1 η 2 διαφορετικες γραμμες και στην πρωτη περιπτωση ειναι μια και ετσι ενωνω την γραμμη σε μια λιστα ωστε να κανω εκει τις πραξεις
                                    if (listStops.get(strSt).getLineID() == listStops.get(dstSt).getLineID()) {
                                        // εδω ειναι αν η σταση που βρισκεται ειναι αριστερα απο την σταση που θελει να παει
                                        if (strSt<dstSt){
                                            for (int res = strSt; res < dstSt; res++ ){
                                                listForStopResults.add(listStops.get(res));
                                                time = 0;
                                                for (int t = 0; t < listForStopResults.size();t++){
                                                    time += listForStopResults.get(t).getArrStopR();
                                                    time += listForStopResults.get(t).getAnchorTime();
                                                }
                                            }
                                        }
                                        // εδω ειναι αν η σταση που βρισκεται ειναι δεξια απο την σταση που θελει να παει
                                        if (strSt>dstSt){
                                            for (int res = strSt; res > dstSt; res-- ){
                                                listForStopResults.add(listStops.get(res));
                                                time = 0;
                                                for (int t = 0; t < listForStopResults.size();t++){
                                                    time += listForStopResults.get(t).getArrStopL();
                                                    time += listForStopResults.get(t).getAnchorTime();
                                                }
                                            }
                                        }
                                    }
                                    // σε αυτη την if ειναι 2 διαφορετικες γραμμες και προσθετω την δευτερη γραμμη στην λιστα και μετα την πρωτη γραμμη και επιτοπου κανω τις πραξεις να βγει ο χρονος
                                    else if (listStops.get(strSt).getLineID() != listStops.get(dstSt).getLineID()){
                                        for (int sTran = 0 ; sTran < listStops.size(); sTran++){
                                            if (listStops.get(sTran).getStopType() == 3 && listStops.get(strSt).getLineID() == listStops.get(sTran).getLineID()){

                                                for (int dTran = 0 ; dTran < listStops.size(); dTran++){

                                                    if (listStops.get(dTran).getStopType() == 3 &&( ( listStops.get(sTran).getStopName().contains(listStops.get(dTran).getStopName().substring(0, cut.lastIndexOf(" "))) )&& ( listStops.get(dTran).getLineID() != listStops.get(sTran).getLineID() ) ) ){

                                                        // εδω ειναι αν η αρχικη σταση ειναι αριστερα την σταση τρανσιτ
                                                        if (strSt<sTran){

                                                            time = 0;
                                                            // εδω ειναι αν η σταση που θελει να παει ειναι αριστερα απο την σταση τρανσιτ της αλλης γραμμης
                                                           if (dstSt<dTran){


                                                               for ( int res = dTran; res > dstSt; res--){
                                                                   time += listStops.get(res).getArrStopL();
                                                                   time += listStops.get(res).getAnchorTime();
                                                               }
                                                           }
                                                           // εδω ειναι αν η σταση που θελει να παει ειναι δεξια απο την σταση τρανσιτ της αλλης γραμμης
                                                           else if (dstSt>dTran){


                                                               for (int res = dTran; res < dstSt; res++){
                                                                   time += listStops.get(res).getArrStopR();
                                                                   time += listStops.get(res).getAnchorTime();
                                                                }
                                                            }

                                                           for (int res = strSt; res < sTran; res++){

                                                               listForStopResults.add(listStops.get(res));
                                                               time += listStops.get(res).getArrStopR();
                                                               time += listStops.get(res).getAnchorTime();
                                                           }
                                                        }
                                                        // εδω ειναι αν η αρχικη σταση ειναι δεξια την σταση τρανσιτ
                                                        else if (strSt>sTran){

                                                            time = 0;
                                                            // εδω ειναι αν η σταση που θελει να παει ειναι αριστερα απο την σταση τρανσιτ της αλλης γραμμης
                                                           if (dstSt<dTran){


                                                               for ( int res = dTran; res > dstSt; res--){
                                                                   time += listStops.get(res).getArrStopL();
                                                                   time += listStops.get(res).getAnchorTime();
                                                               }
                                                           }
                                                           // εδω ειναι αν η σταση που θελει να παει ειναι δεξια απο την σταση τρανσιτ της αλλης γραμμης
                                                           else if (dstSt>dTran){


                                                               for (int res = dTran; res < dstSt; res++){
                                                                   time += listStops.get(res).getArrStopR();
                                                                   time += listStops.get(res).getAnchorTime();
                                                                }
                                                            }

                                                           for (int res = strSt; res > sTran; res--){

                                                               listForStopResults.add(listStops.get(res));
                                                               time += listStops.get(res).getArrStopL();
                                                               time += listStops.get(res).getAnchorTime();
                                                           }
                                                        }
                                                    }      
                                                }
                                            }  
                                        }
                                    }
                                }
                            } 
                        }
                    }

                    System.out.println("Ο προσδοκώμενος χρονος που θα χρειαστει ειναι " + time + " δευτερολεπτα");

                    break;
            }
            menuFrsT = 1;
        }while(menuSel == false);
    }
}