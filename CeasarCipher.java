


public class CeasarCipher {
    public String encrypt(String input, int key){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaKey = alpha.substring(key) + alpha.substring(0,key);
        
        StringBuilder encrypted = new StringBuilder(input);
        for(int i=0; i < input.length(); i++){
            
            char currChar = input.charAt(i);
            int idx = alpha.indexOf(currChar);
            if (idx != -1){
              
                encrypted.setCharAt(i, alphaKey.charAt(idx));
            }

        }

        return encrypted.toString();
    }
    public void testCC(){

        String input = "FIRST LEGION ATTACK EAST FLANK";
        int key = 23;
        System.out.println(encrypt(input, key));
    }
}

