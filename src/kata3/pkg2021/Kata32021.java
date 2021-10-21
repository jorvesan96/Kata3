package kata3.pkg2021;

public class Kata32021 {

    public static void main(String[] args) {
       
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpc.es");
        histogram.increment("ulpc.es");
        histogram.increment("alu.ulpc.es");
        histogram.increment("alu.ulpc.es");
        histogram.increment("alu.ulpc.es");
        histogram.increment("alu.ulpc.es");
        histogram.increment("alu.ulpc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        histogram.increment("aegee.org");
        
        HistogramDisplay histo= new HistogramDisplay(histogram);
        histo.execute();
        
    }
    
}
