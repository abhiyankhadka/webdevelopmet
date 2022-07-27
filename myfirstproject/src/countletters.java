public class countletters {
    public static void main(String[] args) {
        String s="the quick brown for fell down and cried.";
        int maxindex=(int)Character.MAX_VALUE;
        System.out.println(maxindex);
        int countletter[]= new int[maxindex+1];
        char arr[]=s.toCharArray();
        for(int i=0; i<arr.length;i++){
            countletter[(int) (arr[i])]++;
        }
        for (int i=0;i<countletter.length;i++){
            if(countletter[i] !=0){
                System.out.println((char) (i) + "->" +countletter[i]);
            }

        }
    }
    
}
