package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @autor : eynar.pari
 * @date : 26/09/2020.
 **/
public class ReportGenerator {


    public static void main(String[]args){
        String path="C:\\Users\\Aldo Flores\\Documents\\GITHUB\\tarea2\\build\\reports\\cucumber\\";


        File reportOutPut= new File(path+"tarea2_Reporte");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path+"report.json");

        Configuration configuration =  new Configuration(reportOutPut,"UCB Diplomado");
        configuration.setBuildNumber("v50.0");
        configuration.addClassifications("SO","Windows");
        configuration.addClassifications("Owner","Aldo Flores");
        configuration.addClassifications("Branch","cucumber");
        configuration.addClassifications("Type Report","Local");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();
    }





}
