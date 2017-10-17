package SVM;

import java.awt.Color;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class GraphFrame extends ApplicationFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GraphFrame(final String title) {
	    super(title);
	    // Create dataset
	    XYDataset dataset = createDataset();
	    // Create chart
	    JFreeChart chart = ChartFactory.createScatterPlot(
	        "Dataset Points and Separating Hyperplanes", 
	        "X", "Y", dataset);
	    //Changes background color
	    XYPlot plot = (XYPlot) chart.getPlot();
	    plot.setBackgroundPaint(new Color(255,228,196));
	    // Create Panel
	    ChartPanel panel = new ChartPanel(chart);
	    setContentPane(panel);
	}
	private XYDataset createDataset() {
		XYSeriesCollection dataset = new XYSeriesCollection();
		XYSeries series1 = new XYSeries("Positive");
	    series1.add(3,3);
	    series1.add(3,4);
	    series1.add(2,3);
	    dataset.addSeries(series1);
	    XYSeries series2  = new XYSeries("Negative");
	    series2.add(1,1);
	    series2.add(1,3);
	    series2.add(2,2);
	    dataset.addSeries(series2);
	    return dataset;
	}
}
