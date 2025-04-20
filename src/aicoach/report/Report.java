package aicoach.report;

import java.util.Date;

public class Report {

    public Report(String reportId, Date generatedOn, String format) {
    }

    public void generateCSV() {
        System.out.println("CSV report generated.");
    }

    public void generatePDF() {
        System.out.println("PDF report generated.");
    }
}
