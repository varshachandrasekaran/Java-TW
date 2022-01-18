class RnaTranscription {

    String transcribe(String dnaStrand) {
       char[] rnaStrand=dnaStrand.toCharArray();
       String resultDnaStrand="";
       for(int i=0;i<rnaStrand.length;i++){
           switch(rnaStrand[i]){
               case 'G': 
                   resultDnaStrand+="C";
                   break;
               case 'C': 
                   resultDnaStrand+="G";
                   break;
               case 'T': 
                   resultDnaStrand+="A";
                   break;
               case 'A': 
                   resultDnaStrand+="U";
                   break;
               
           }
       }
       return resultDnaStrand;
    }

}
