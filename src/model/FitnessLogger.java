/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FitnessLogger {

    private final File file = new File("/home/user/NetBeansProjects/Test/src/Посещения.txt");
    private FileWriter fileWriter;
    private  BufferedWriter bufferedWriter;

    public void writeVisits(String string) throws IOException {
        bufferedWriter.append(string);
        bufferedWriter.newLine();
    }

    public void close() throws IOException {
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public FitnessLogger() throws IOException {
        this.fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);
    }
}
