package runall;

public class ClassObject7 {
	public static void main(String[] args) {
		SevaCenter seva=new SevaCenter();
		String sevaCounters[]=new String[5];
		sevaCounters[0]="Marriage Registration Counter..";
		sevaCounters[1]="Birth Registration Counter..";
		sevaCounters[2]="Vacine Registration Counter..";
		sevaCounters[3]="Death Registration Counter..";
		sevaCounters[4]="Land Registration Counter..";
		seva.setCounters(sevaCounters);
		
		System.out.println(seva.getCounter(1));
		System.out.println(seva.getCounter(4));
	}
}
class SevaCenter{
	String counters[]=new String[5];
	public void setCounters(String counters[]) {
		this.counters=counters;
	}
	
	public String getCounter(int i) {
		return counters[i];

	}

}
