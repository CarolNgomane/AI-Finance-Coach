package aicoach.report;

import java.util.Date;

public class Report {
    private String reportId;
    private Date generatedOn;
    private String format;

    public Report(String reportId, Date generatedOn, String format) {
        this.reportId = reportId;
        this.generatedOn = generatedOn;
        this.format = format;
    }

    public void generateCSV() {
        System.out.println("CSV report generated.");
    }

    public void generatePDF() {
        System.out.println("PDF report generated.");
    }
}
