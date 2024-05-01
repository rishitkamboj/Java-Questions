package arrayssss;

import java.io.*;

public class matrixmult {


    boolean passcheck(String s){
        if(s.length()<6){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'a' && s.charAt(i)>'z'){
                return false;
            }
            if(s.charAt(i)<'0' && s.charAt(i)>'9'){
                return false;
            }
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                count++;
            }
        }
        if(count<3){
            return false;
        }
        return true;
    }
}


