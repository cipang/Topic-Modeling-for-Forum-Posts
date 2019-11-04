import com.hankcs.hanlp.*;
import com.hankcs.hanlp.seg.common.Term;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChineseLP {

    public static void main(String args[]){

        BufferedReader reader;
        OutputStream output;

        try{
            output = new FileOutputStream("../ourstep_out.txt");
            Writer outputWriter = new OutputStreamWriter(output);
            reader = new BufferedReader(new FileReader("../ourstep_full.txt"));
            String line = reader.readLine();
            while (line != null) {
                List<Term> segLine = HanLP.segment(line);
                String outLine = "";
                for (Term element : segLine) {
                    if (!element.word.equals(" ")) {
                        outLine = outLine + element.word + " ";
                    }
                }

                System.out.println(outLine);
                outputWriter.write(outLine+"\n");
                line = reader.readLine();
            }

        }catch (IOException e){
            e.getMessage();
        }

    }
}
