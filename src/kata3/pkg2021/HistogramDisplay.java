package kata3.pkg2021;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    private final Histogram<String> histogram;
    
    public HistogramDisplay(Histogram<String> histogram) {
        super("HISTOGRAMA");
        this.histogram=histogram;
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart  = ChartFactory.createBarChart("Histograma JFreeChart", 
                "Dominios email", "Nº de emails", dataSet, 
                PlotOrientation.VERTICAL,false, false, rootPaneCheckingEnabled );
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.addValue(3, "", "ulpgc.es");
        dataset.addValue(5, "", "alu.ulpgc.es");
        dataset.addValue(9, "", "hotmail.com");
        dataset.addValue(15, "", "gmail.com");
        return dataset;
    }
    
}
