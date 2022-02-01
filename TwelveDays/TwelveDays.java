class TwelveDays {
    public static String[] days={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    public static String[] initialVerse={"On the","day of Christmas my true love gave to me:"};
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
        String result=initialVerse[0]+" "+days[verseNumber-1]+" "+initialVerse[1]+" "+buildVerse(verseNumber);
        return result;
    }
    String buildVerse(int verseNumber){
        String song="";
        for(int index=verseNumber-1;index>=0;index--){
            song+=gifts[index];
            if(index>0){
                song+=", ";
            }
            if(index==1){
                song+="and ";
            }
        }
        return song+"\n";
    }
    String verses(int startVerse, int endVerse) {
        String resultVerses="";
        for(int index=startVerse;index<=endVerse;index++){
            resultVerses+=verse(index);
             if (index < endVerse) {
                resultVerses += "\n";
             }
        }
        
        return resultVerses;
    }
    
    String sing() {
        int startVerse=1;
        int endVerse=12;
        return verses(startVerse,endVerse);
    }
}
