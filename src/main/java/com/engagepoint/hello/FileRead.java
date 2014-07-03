package com.engagepoint.hello;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by lyolik on 04.07.2014.
 */
public class FileRead {

        public static void main( String[] args )
                throws FileNotFoundException, IOException {

            File file = new File( "G:\\Kak_dobavit_knigi.txt" );
            BufferedReader br=null;
            try {
            br = new BufferedReader (
                    new InputStreamReader(
                            new FileInputStream( file ), "windows-1251"
                    )
            );
            } catch (FileNotFoundException e) {
                System.out.println("File \"" + file + "\" not found");
                return;
            }
            String line = null;
            try
            {
            while ((line = br.readLine()) != null) {
                //variable line does NOT have new-line-character at the end
                System.out.println( line );
            }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                br.close();
            }
        }
    }