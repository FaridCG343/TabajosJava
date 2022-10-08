public class E {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        
        int n=cap.nextInt(),cont=0;
        
        int array[]= new int[n];
        
        for(int i=0; i<n; i++){
            array[i]=cap.nextInt();
        }
        
        for(int i = (n-1); i>=0; i--){
            if( !(array[i]==0) ){
                int xd = array[i];
                for(int j = (i-1); j>=0 ; j--){
                    if( xd +1 == array[j] ){
                        array[j] = 0;
                        xd++;
                    }
                }
                //System.out.println(Arrays.toString(array));
                array[i] = 0;
                cont=cont+1;
            }
        }
       // System.out.println(Arrays.toString(array));
        System.out.println(cont);
    }    
}
