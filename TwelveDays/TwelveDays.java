class TwelveDays {
    public static String[] days={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    public static String[] initialLine={"On the","day of Christmas my true love gave to me:"};
    public static String[] gifts={
        "a Partridge in a Pear Tree.",
        "two Turtle Doves",
        "three French Hens",
        "four Calling Birds",
        "five Gold Rings",
        "six Geese-a-Laying",
        "seven Swans-a-Swimming",
        "eight Maids-a-Milking",
        "nine Ladies Dancing",
        "ten Lords-a-Leaping",
        "eleven Pipers Piping",
        "twelve Drummers Drumming"
    };
    String verse(int verseNumber) {
        String result=initialLine[0]+" "+days[verseNumber-1]+" "+initialLine[1]+" "+buildVerse(verseNumber);
        return result;
    }
    String buildVerse(int verseNumber){
        String s="";
        for(int i=verseNumber-1;i>=0;i--){
            s+=gifts[i];
            if(i>0){
                s+=", ";
            }
            if(i==1){
                s+="and ";
            }
        }
        return s=s+"\n";
    }
    String verses(int startVerse, int endVerse) {
        String resultVerses="";
        for(int i=startVerse;i<=endVerse;i++){
            resultVerses+=verse(i);
             if (i < endVerse) {
                resultVerses += "\n";
             }
        }
        
        return resultVerses;
    }
    
    String sing() {
        return verses(1,12);
    }
}