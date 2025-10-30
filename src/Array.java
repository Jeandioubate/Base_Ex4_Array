


public class Array {
	
	public static double findMin(double[] notes) {
		if (notes == null || notes.length == 0) {
			return 0;
		}
		double min = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if (notes[i] < min) {
				min = notes[i];
			}
		}
		return min;
	}
	
	
	public static double findMax(double[] notes) {
		if (notes == null || notes.length == 0) {
			return 0;
		}
		double max = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if (notes[i] > max) {
				max = notes[i];
			}
		}
		return max;
	}
	
	
    public static double calculateAverage(double[] notes) {
        if (notes == null || notes.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.length;
    }

	public static void main(String[] args) {
		double[] notes = {12.5, 15.0, 8.5, 18.0, 10.0, 14.5};

        System.out.println("Note la plus petite: " + findMin(notes));
        System.out.println("Note la plus grande: " + findMax(notes));
        System.out.println("Moyenne: " + calculateAverage(notes));

	}

}



