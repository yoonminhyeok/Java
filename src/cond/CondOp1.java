package cond;

import com.sun.jdi.PathSearchingVirtualMachine;

public class CondOp1 {
    public static void main(String[] args) {

        int age=19;
        String status;

        if(age>=20)
        {
            status="성인";
        }
        else {
            status="미성년자";
        }
        System.out.println("나이: "+age+ " 상태: "+status );
    }
}
