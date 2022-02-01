class RnaTranscription {

    String transcribe(String dnaStrand) {
       char[] rnaStrand=dnaStrand.toCharArray();
       String resultDnaStrand="";
       for(int index=0;index<rnaStrand.length;index++){
           switch(rnaStrand[index]){
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