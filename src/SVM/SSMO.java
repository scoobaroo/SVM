package SVM;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;

public class SSMO {
	ArrayList<ArrayList<Entry<Double, Double>> > rowList; 
	HashMap<Entry<Integer,Integer> ,Integer> map;
	double[] lambdas;
	double C;
	double epsilon;
	
	public SSMO() {
	}
	public SSMO(double[] lambdas, HashMap<Entry<Integer,Integer>,Integer> map, double C) { 
		this.map = map;
		this.lambdas = lambdas;
		this.C = C;
	}
	
	public void init() {
		rowList = new ArrayList<ArrayList<Entry<Double, Double>> >();
		map = new LinkedHashMap<Entry<Integer,Integer>,Integer>();
		lambdas= new double[6];
		this.C = 2.5;
		this.epsilon = 0.00001;
		Entry<Integer,Integer> x1 = new AbstractMap.SimpleEntry<Integer,Integer>(3,3);
		Entry<Integer,Integer> x2 = new AbstractMap.SimpleEntry<Integer,Integer>(3,4);
		Entry<Integer,Integer> x3 = new AbstractMap.SimpleEntry<Integer,Integer>(2,3);
		Entry<Integer,Integer> x4 = new AbstractMap.SimpleEntry<Integer,Integer>(1,1);
		Entry<Integer,Integer> x5 = new AbstractMap.SimpleEntry<Integer,Integer>(1,3);
		Entry<Integer,Integer> x6 = new AbstractMap.SimpleEntry<Integer,Integer>(2,2);
		map.put(x1, 1);
		map.put(x2, 1);
		map.put(x3, 1);
		map.put(x4, -1);
		map.put(x5, -1);
		map.put(x6, -1);
		ArrayList<Entry<Double,Double>> row1 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row2 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row3 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row4 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row5 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row6 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row7 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row8 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row9 = new ArrayList<Entry<Double,Double>>();
		ArrayList<Entry<Double,Double>> row10 = new ArrayList<Entry<Double,Double>>();
		Entry<Double,Double> row1pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[0],lambdas[1]);
		Entry<Double,Double> row1pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[1],lambdas[2]);
		Entry<Double,Double> row1pair3 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[2],lambdas[3]);
		Entry<Double,Double> row1pair4 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[3],lambdas[4]);
		Entry<Double,Double> row1pair5 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[4],lambdas[5]);
		row1.add(row1pair1);
		row1.add(row1pair2);
		row1.add(row1pair3);
		row1.add(row1pair4);
		row1.add(row1pair5);
		Entry<Double,Double> row2pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[0],lambdas[2]);
		Entry<Double,Double> row2pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[1],lambdas[3]);
		Entry<Double,Double> row2pair3 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[2],lambdas[4]);
		Entry<Double,Double> row2pair4 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[3],lambdas[5]);
		row2.add(row2pair1);
		row2.add(row2pair2);
		row2.add(row2pair3);
		row2.add(row2pair4);
		Entry<Double,Double> row3pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[0],lambdas[3]);
		Entry<Double,Double> row3pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[1],lambdas[4]);
		Entry<Double,Double> row3pair3 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[2],lambdas[5]);
		row3.add(row3pair1);
		row3.add(row3pair2);
		row3.add(row3pair3);
		Entry<Double,Double> row4pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[0],lambdas[4]);
		Entry<Double,Double> row4pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[1],lambdas[5]);
		row4.add(row4pair1);
		row4.add(row4pair2);
		Entry<Double,Double> row5pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[0],lambdas[5]);
		row5.add(row5pair1);
		Entry<Double,Double> row6pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[1],lambdas[0]);
		Entry<Double,Double> row6pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[2],lambdas[1]);
		Entry<Double,Double> row6pair3 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[3],lambdas[2]);
		Entry<Double,Double> row6pair4 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[4],lambdas[3]);
		Entry<Double,Double> row6pair5 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[5],lambdas[4]);
		row6.add(row6pair1);
		row6.add(row6pair2);
		row6.add(row6pair3);
		row6.add(row6pair4);
		row6.add(row6pair5);
		Entry<Double,Double> row7pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[2],lambdas[0]);
		Entry<Double,Double> row7pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[3],lambdas[1]);
		Entry<Double,Double> row7pair3 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[4],lambdas[2]);
		Entry<Double,Double> row7pair4 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[5],lambdas[3]);
		row7.add(row7pair1);
		row7.add(row7pair2);
		row7.add(row7pair3);
		row7.add(row7pair4);
		Entry<Double,Double> row8pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[3],lambdas[0]);
		Entry<Double,Double> row8pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[4],lambdas[1]);
		Entry<Double,Double> row8pair3 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[5],lambdas[2]);
		row8.add(row8pair1);
		row8.add(row8pair2);
		row8.add(row8pair3);
		Entry<Double,Double> row9pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[4],lambdas[0]);
		Entry<Double,Double> row9pair2 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[5],lambdas[1]);
		row9.add(row9pair1);
		row9.add(row9pair2);
		Entry<Double,Double> row10pair1 = new AbstractMap.SimpleEntry<Double,Double>(lambdas[5],lambdas[0]);
		row10.add(row10pair1);
		rowList.add(row1);
		rowList.add(row2);
		rowList.add(row3);
		rowList.add(row4);
		rowList.add(row5);
		rowList.add(row6);
		rowList.add(row7);
		rowList.add(row8);
		rowList.add(row9);
		rowList.add(row10);
		for(int i = 0; i < lambdas.length; i++) {
			lambdas[i] = 0;
		}
		this.epsilon = 0;
	}
	
	public SSMOReturn train() {
		ArrayList<ArrayList<Entry<Integer,Integer>>> ijList = new ArrayList<ArrayList<Entry<Integer,Integer>>>();
		ArrayList<Entry<Integer,Integer>> ijrow1 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow2 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow3 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow4 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow5 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow6 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow7 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow8 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow9 = new ArrayList<Entry<Integer,Integer>>();
		ArrayList<Entry<Integer,Integer>> ijrow10 = new ArrayList<Entry<Integer,Integer>>();
		Entry<Integer,Integer> ijrow1entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(0,1);
		Entry<Integer,Integer> ijrow1entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(1,2);
		Entry<Integer,Integer> ijrow1entry3 = new AbstractMap.SimpleEntry<Integer,Integer>(2,3);
		Entry<Integer,Integer> ijrow1entry4 = new AbstractMap.SimpleEntry<Integer,Integer>(3,4);
		Entry<Integer,Integer> ijrow1entry5 = new AbstractMap.SimpleEntry<Integer,Integer>(4,5);
		ijrow1.add(ijrow1entry1);
		ijrow1.add(ijrow1entry2);
		ijrow1.add(ijrow1entry3);
		ijrow1.add(ijrow1entry4);
		ijrow1.add(ijrow1entry5);
		Entry<Integer,Integer> ijrow2entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(0,2);
		Entry<Integer,Integer> ijrow2entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(1,3);
		Entry<Integer,Integer> ijrow2entry3 = new AbstractMap.SimpleEntry<Integer,Integer>(2,4);
		Entry<Integer,Integer> ijrow2entry4 = new AbstractMap.SimpleEntry<Integer,Integer>(3,5);
		ijrow2.add(ijrow2entry1);
		ijrow2.add(ijrow2entry2);
		ijrow2.add(ijrow2entry3);
		ijrow2.add(ijrow2entry4);
		Entry<Integer,Integer> ijrow3entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(0,3);
		Entry<Integer,Integer> ijrow3entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(1,4);
		Entry<Integer,Integer> ijrow3entry3 = new AbstractMap.SimpleEntry<Integer,Integer>(2,5);
		ijrow3.add(ijrow3entry1);
		ijrow3.add(ijrow3entry2);
		ijrow3.add(ijrow3entry3);
		Entry<Integer,Integer> ijrow4entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(0,4);
		Entry<Integer,Integer> ijrow4entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(1,5);
		ijrow4.add(ijrow4entry1);
		ijrow4.add(ijrow4entry2);
		Entry<Integer,Integer> ijrow5entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(0,5);
		ijrow5.add(ijrow5entry1);
		Entry<Integer,Integer> ijrow6entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(1,0);
		Entry<Integer,Integer> ijrow6entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(2,1);
		Entry<Integer,Integer> ijrow6entry3 = new AbstractMap.SimpleEntry<Integer,Integer>(3,2);
		Entry<Integer,Integer> ijrow6entry4 = new AbstractMap.SimpleEntry<Integer,Integer>(4,3);
		Entry<Integer,Integer> ijrow6entry5 = new AbstractMap.SimpleEntry<Integer,Integer>(5,4);
		ijrow6.add(ijrow6entry1);
		ijrow6.add(ijrow6entry2);
		ijrow6.add(ijrow6entry3);
		ijrow6.add(ijrow6entry4);
		ijrow6.add(ijrow6entry5);
		Entry<Integer,Integer> ijrow7entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(2,0);
		Entry<Integer,Integer> ijrow7entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(3,1);
		Entry<Integer,Integer> ijrow7entry3 = new AbstractMap.SimpleEntry<Integer,Integer>(4,2);
		Entry<Integer,Integer> ijrow7entry4 = new AbstractMap.SimpleEntry<Integer,Integer>(5,3);
		ijrow7.add(ijrow7entry1);
		ijrow7.add(ijrow7entry2);
		ijrow7.add(ijrow7entry3);
		ijrow7.add(ijrow7entry4);
		Entry<Integer,Integer> ijrow8entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(3,0);
		Entry<Integer,Integer> ijrow8entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(4,1);
		Entry<Integer,Integer> ijrow8entry3 = new AbstractMap.SimpleEntry<Integer,Integer>(5,2);
		ijrow8.add(ijrow8entry1);
		ijrow8.add(ijrow8entry2);
		ijrow8.add(ijrow8entry3);
		Entry<Integer,Integer> ijrow9entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(4,0);
		Entry<Integer,Integer> ijrow9entry2 = new AbstractMap.SimpleEntry<Integer,Integer>(5,1);
		ijrow9.add(ijrow9entry1);
		ijrow9.add(ijrow9entry2);
		Entry<Integer,Integer> ijrow10entry1 = new AbstractMap.SimpleEntry<Integer,Integer>(5,0);
		ijrow10.add(ijrow10entry1);
		ijList.add(ijrow1);
		ijList.add(ijrow2);
		ijList.add(ijrow3);
		ijList.add(ijrow4);
		ijList.add(ijrow5);
		ijList.add(ijrow6);
		ijList.add(ijrow7);
		ijList.add(ijrow8);
		ijList.add(ijrow9);
		ijList.add(ijrow10);
		for(ArrayList<Entry<Integer,Integer>> list : ijList) {
			for(Entry<Integer,Integer> entry: list) {
				int i = entry.getKey();
				int j = entry.getValue();
				System.out.println(map);
				Entry<Integer,Integer> Xi =  (Entry<Integer, Integer>) (map.keySet().toArray())[i];
				Entry<Integer,Integer> Xj = (Entry<Integer,Integer>) (map.keySet().toArray())[j];
				int a = Xi.getKey();
				int b = Xi.getValue();
				int[] ab = new int[] {a,b};
				int c = Xj.getKey();
				int d = Xj.getValue();
				int[] cd = new int[] {c,d};
				printArray(ab);
				int D = 2 * dotProduct(ab,cd) - dotProduct(ab,ab) - dotProduct(cd,cd);
				if( Math.abs(D) > epsilon) {
					double Ei = f(ab) - map.get(Xi);
					double Ej = f(cd) - map.get(Xj);
					
					//stopped here
				}
			}
		}
			System.out.println(ijList);


		SSMOReturn ssmoreturn = new SSMOReturn();
		return ssmoreturn;
	}
	public static void main(String[] args) {
		System.out.println("In Main");
		SSMO ssmo = new SSMO();
		ssmo.init();
		ssmo.train();
	}
	public static void printArray(int[] array) {
	    for (int i : array) {
	        System.out.print(i + " ");
	    }
		System.out.println();
	}
	public double f(int[] vector) {
		double sum = 0;
		for(int i=0; i< lambdas.length; i++) {
			Entry<Integer,Integer> Xi = (Entry<Integer,Integer>) (map.keySet().toArray())[i];
			int a = Xi.getKey();
			int b = Xi.getValue();
			int[] arr = new int[] {a,b} ;
			double element = lambdas[i] * z[i] * dotProduct(vector, arr) + b
			sum+=element;
		}
		return sum;
	}
	public int dotProduct(int[] array1, int[] array2) {
	     int n = array1.length;
	     int sum = 0;
	     for (int i = 0; i < n; i++) 
	     {
	        sum += array1[i] * array2[i];    
	     }
	     System.out.println(sum);
	     return sum;
	}
}
