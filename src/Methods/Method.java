package Methods;

public class Method {
    

	//Ειναι μια μεθοδος η οποια βρηκα στο ιντερνετ και η δουλεια της ειναι να κανει κεφαλαιο το πρωτο γραμμα της λεξης        
        //και οπου βρισκει κενο μετα θεωρει το επομενο γραμμα ως αρχη λεξης και το κανει κεφαλαιο και αυτο.

    public static String CapitalizeEachWord(String st){
        String result = "";
        //this insert a blank char before all capital char
        st = st.replaceAll("() ([A-Z])", "$1 $2");
        String[] words = st.split(" ");
        for (String word: words){
            if (word.length() > 0)
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            
        }
        result = result.trim();
        return result;
    }

}
