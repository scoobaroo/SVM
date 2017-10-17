package SVM;
import java.util.Map.Entry;
import java.util.Random;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.jfree.ui.RefineryUtilities;

public class SSMO {
	ArrayList<ArrayList<Entry<Double, Double>> > rowList; 
	static HashMap<Entry<Integer,Integer> ,Integer> map;
	static double[] lambdas;
	static double C;
	double epsilon;
	double[] b;
	double B;

	public SSMO(double[] lambdas, HashMap<Entry<Integer,Integer>,Integer> map, double C) { 
		SSMO.map = map;
		SSMO.lambdas = lambdas;
		SSMO.C = C;
	}
	
	public ArrayList<ArrayList<Entry<Integer, Integer>>> init() {
		map = new LinkedHashMap<Entry<Integer,Integer>,Integer>();
		lambdas= new double[6];
		for(int i = 0; i < lambdas.length; i++) {
			lambdas[i] = 0;
		}
		b = new double[lambdas.length];
		SSMO.C = 2.5;
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
		return ijList;
	}
	
	public ArrayList<Entry<Integer, Integer>> init2() {
		map = new LinkedHashMap<Entry<Integer,Integer>,Integer>();
		lambdas= new double[6];
		for(int i = 0; i < lambdas.length; i++) {
			lambdas[i] = 0;
		}
		b = new double[lambdas.length];
		SSMO.C = 2.5;
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
		ArrayList<Entry<Integer,Integer>> ijList2 = new ArrayList<>();
		ArrayList<Integer> shuffleList = new ArrayList<>();
		while(ijList2.size() < 1000) {
			for(int i = 0 ; i < lambdas.length ; i++) {
				shuffleList.clear();
				for(int j = 0 ; j < lambdas.length ; j++) {
					shuffleList.add(j);
				}
				System.out.println("New Shuffle List: " + shuffleList);
				Random rand = new Random();
				if(shuffleList.size() == 6) {
					shuffleList.remove(i);
					Collections.shuffle(shuffleList, rand);
					System.out.println("After shuffle:" + shuffleList);
					Entry<Integer,Integer> entry = new AbstractMap.SimpleEntry<Integer, Integer>(i,shuffleList.get(0));
					ijList2.add(entry);
					System.out.println(entry);
				}
			}
		}
		ijList2.remove(1001);
		ijList2.remove(1000);
		System.out.println(ijList2.size());
		return ijList2;
	}
	

	public SSMOReturn train2(ArrayList<Entry<Integer,Integer>> ijList2) {
		B = 0.0;
		System.out.println("epsilon: " + epsilon);
		double[] oldLambdas2 = new double[lambdas.length];
		double[] oldLambdas = new double[lambdas.length];
		while(true) {
			for(Entry<Integer,Integer> entry : ijList2) {
				System.out.println("------------------WE ARE TRAINING IN TRAIN2------------");
				int i = entry.getKey();
				int j = entry.getValue();
				Entry<Integer,Integer> Xi =  (Entry<Integer, Integer>) (map.keySet().toArray())[i];
				Entry<Integer,Integer> Xj = (Entry<Integer,Integer>) (map.keySet().toArray())[j];
				int D = 2 * dotProduct(Xi,Xj) - dotProduct(Xi,Xi) - dotProduct(Xj,Xj);
				System.out.println("D: " + D);
				if( Math.abs(D) > epsilon) {
					// zi is map.get(Xi)
					// zj is map.get(Xj)
					double zi = map.get(Xi).doubleValue(); 
					double zj = map.get(Xj).doubleValue(); 
					double Ei = f(Xi) - zi;
					double Ej = f(Xj) - zj;
					oldLambdas[i] = lambdas[i];
					oldLambdas[j] = lambdas[j];
					lambdas[j] = lambdas[j] - zj * (Ei - Ej) / D;
					double h;
					double l;
					if( map.get(Xi) == map.get(Xj) ) {
						ArrayList<Double> listL = new ArrayList<>();
						listL.add(0.0);
						double elementL = lambdas[i] + lambdas[j] - C;
						listL.add(elementL);
						l = Collections.max(listL);
						ArrayList<Double> listH = new ArrayList<>();
						listH.add(C);
						double elementH = lambdas[i] + lambdas[j];
						listH.add(elementH);
						h = Collections.min(listH);
					} else {
						ArrayList<Double> listL2 = new ArrayList<>();
						listL2.add(0.0);
						double elementL2 = lambdas[j] - lambdas[i];
						listL2.add(elementL2);
						l = Collections.max(listL2);
						ArrayList<Double> listH2 = new ArrayList<>();
						listH2.add(C);
						double elementH2 = C + lambdas[j] - lambdas[i];
						listH2.add(elementH2);
						h = Collections.min(listH2);
					}
					if(lambdas[j] > h) {
						lambdas[j] = h;
					} else if(lambdas[j] >= l && lambdas[j]<= h) {
						lambdas[j] = lambdas[j];
					} else {
						lambdas[j] = l;
					}
					lambdas[i] += zi*zj*(oldLambdas[j] - lambdas[j]);
					b[i] = B - Ei - zi * (lambdas[i] - oldLambdas[i]) * dotProduct(Xi,Xi) - zj * (lambdas[j] - oldLambdas[j]) * dotProduct(Xi, Xj);
					b[j] = B - Ej - zi * (lambdas[i] - oldLambdas[i]) * dotProduct(Xi,Xj) - zj * (lambdas[j] - oldLambdas[j]) * dotProduct(Xj, Xj);
					System.out.println("b values calculated ..... ");
					printArrayDouble(b);
					if(lambdas[i]<C && lambdas[i]>0) {
						B = b[i];
					} else if (lambdas[j]<C && lambdas[j]>0) {
						B = b[j];
					} else {
						B = ( b[i] + b[j] ) / 2;
					}
					System.out.println("B value at the end of this round : " + B);
					System.out.println("lambdas after this round");
					printArrayDouble(lambdas);
					System.out.println("oldLambdas after this round");
					printArrayDouble(oldLambdas);
				}
				boolean match = Arrays.equals(lambdas, oldLambdas);
				System.out.println("match value: "  +match);
				if(match) {
					break;
				}
			}
			SSMOReturn sr = new SSMOReturn(lambdas, B);
			return sr;
		}
	}
	
	
	public SSMOReturn train(ArrayList<ArrayList<Entry<Integer, Integer>>> ijList) {
		B = 0.0;
		System.out.println("epsilon: " + epsilon);
		double oldLambdas[] = new double[lambdas.length];
		while(true) {
			for(ArrayList<Entry<Integer,Integer>> list : ijList) {
				for(Entry<Integer,Integer> entry: list) {
					System.out.println("WE ARE TRAINING");
					int i = entry.getKey();
					int j = entry.getValue();
					Entry<Integer,Integer> Xi =  (Entry<Integer, Integer>) (map.keySet().toArray())[i];
					Entry<Integer,Integer> Xj = (Entry<Integer,Integer>) (map.keySet().toArray())[j];
					int D = 2 * dotProduct(Xi,Xj) - dotProduct(Xi,Xi) - dotProduct(Xj,Xj);
					System.out.println("D: " + D);
					if( Math.abs(D) > epsilon) {
						double zi = map.get(Xi).doubleValue(); 
						double zj = map.get(Xj).doubleValue(); 
						double Ei = f(Xi) - zi;
						double Ej = f(Xj) - zj;
						oldLambdas[i] = lambdas[i];
						oldLambdas[j] = lambdas[j];
						// zi is map.get(Xi)
						// zj is map.get(Xj)
						lambdas[j] = lambdas[j] - zj * (Ei - Ej) / D;
						double h;
						double l;
						if( map.get(Xi) == map.get(Xj) ) {
							ArrayList<Double> listL = new ArrayList<>();
							listL.add(0.0);
							double elementL = lambdas[i] + lambdas[j] - C;
							listL.add(elementL);
							l = Collections.max(listL);
							ArrayList<Double> listH = new ArrayList<>();
							listH.add(C);
							double elementH = lambdas[i] + lambdas[j];
							listH.add(elementH);
							h = Collections.min(listH);
						} else {
							ArrayList<Double> listL2 = new ArrayList<>();
							listL2.add(0.0);
							double elementL2 = lambdas[j] - lambdas[i];
							listL2.add(elementL2);
							l = Collections.max(listL2);
							ArrayList<Double> listH2 = new ArrayList<>();
							listH2.add(C);
							double elementH2 = C + lambdas[j] - lambdas[i];
							listH2.add(elementH2);
							h = Collections.min(listH2);
						}
						if(lambdas[j] > h) {
							lambdas[j] = h;
						} else if(lambdas[j] >= l && lambdas[j]<= h) {
							lambdas[j] = lambdas[j];
						} else {
							lambdas[j] = l;
						}
						lambdas[i] += zi*zj*(oldLambdas[j] - lambdas[j]);
						b[i] = B - Ei - zi * (lambdas[i] - oldLambdas[i]) * dotProduct(Xi,Xi) - zj * (lambdas[j] - oldLambdas[j]) * dotProduct(Xi, Xj);
						b[j] = B - Ej - zi * (lambdas[i] - oldLambdas[i]) * dotProduct(Xi,Xj) - zj * (lambdas[j] - oldLambdas[j]) * dotProduct(Xj, Xj);
						System.out.println("B values calculated ..... ");
						printArrayDouble(b);
						if(lambdas[i]<C && lambdas[i]>0) {
							B = b[i];
						} else if (lambdas[j]<C && lambdas[j]>0) {
							B = b[j];
						} else {
							B = ( b[i] + b[j] ) / 2;
						}
						System.out.println("lambdas after this round");
						printArrayDouble(lambdas);
						System.out.println("oldLambdas after this round");
						printArrayDouble(oldLambdas);
					}
				}
			}
			boolean match = Arrays.equals(lambdas, oldLambdas);
			if(match) {
				break;
			}
		}
		SSMOReturn sr = new SSMOReturn(lambdas, B);
		return sr;
	}
	
	public double f(Entry<Integer,Integer> Xvector) {
		double sum = 0;
		for(int i=0; i< lambdas.length; i++) {
			Entry<Integer,Integer> Xi = (Entry<Integer,Integer>) (map.keySet().toArray())[i];
//			System.out.println("Input to f(X): " +Xi);
			double zi = map.get(Xi);
//			System.out.println("Z values in f(X): " + zi);
//			System.out.println("B value: " + B);
			double element = lambdas[i] * zi * dotProduct(Xi, Xvector);
//			System.out.println("element value we are adding to sum in f(X): " + element);
			sum+=element;
		}
		System.out.println("f(X) value: "  + sum);
		return sum + B;
	}
		
	public static void main(String[] args) {
		System.out.println("In Main");
		SSMO ssmo = new SSMO(lambdas,map,C);
		ArrayList<ArrayList<Entry<Integer, Integer>> > ijList = ssmo.init();
		SSMOReturn values = ssmo.train(ijList);

		ArrayList<Entry<Integer,Integer>> ijList2 = ssmo.init2();
		SSMOReturn values2 = ssmo.train2(ijList2);
		System.out.println("b value for book's prescriptions: " + values.b);
		System.out.println("Lambda Values for book's prescriptions: ");
		printArrayDouble(values.lambdas);
		System.out.println("-----------------------------------------------------------");
		System.out.println("b value for random selection of lambdas: " + values2.b);
		System.out.println("Lambda Values for random selection of lambdas:");
		printArrayDouble(values2.lambdas);
	    GraphFrame g = new GraphFrame("Graph");
	    g.pack();
	    RefineryUtilities.centerFrameOnScreen(g);
	    g.setVisible(true);
	}
	
	public static void printArray(int[] array) {
	    for (int i : array) {
	        System.out.print(i + ",");
	    }
		System.out.println();
	}
	public static void printArrayDouble(double[] array) {
		System.out.print("[ ");
	    for (double d : array) {
	        System.out.print(d + ",");
	    }
	    System.out.print("]");
		System.out.println();
	}
	public int dotProduct( Entry<Integer,Integer> entry1, Entry<Integer,Integer> entry2) {
		 int a = entry1.getKey();
		 int b = entry1.getValue();
		 int[] ab = new int[] {a,b};
		 int c = entry2.getKey();
		 int d = entry2.getValue();
		 int[] cd = new int[] {c,d};
		 int sum = 0;
		 for (int i = 0; i < ab.length; i++) {
		    sum += ab[i] * cd[i];    
		 }
		 return sum;
	}
}
