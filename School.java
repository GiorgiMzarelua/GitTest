//School კლასი(2018 წლის გამოცდის ამოცანა).
//თქვენი მიზანია დაწეროთ School კლასი, რომლის საშუალებითაც შევძლებთ
//უნივერსიტეტის მართვას. კლასს უნდა ჰქონდეს კონსტრუქტორი და 5 public მეთოდი.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
    
public class School{
	private Map<String, Set<String>> subjToPupil;
	private Map<String, Set<String>> teacherToSubj;
	private Map<String, Set<String>> pupilToSubj;
	private Map<String, Set<String>> subjToTeacher;
//	კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
//	თქვენთვის საჭირო ცვლადებს.
    public School(){
    	subjToPupil = new HashMap<String, Set<String>>();
    	teacherToSubj = new HashMap<String, Set<String>>();
    	subjToTeacher = new HashMap<String, Set<String>>();
    	pupilToSubj = new HashMap<String, Set<String>>();
    }
    
//    addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
//    მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
//    რომ მასწავლებლის სახელი უნიკალურია.
    public void addTeacher(String teacher){
        teacherToSubj.put(teacher, new HashSet<String>());
    }
    
//    addSubject მეთოდის საშუალებით შეგიძლიათ მასწავლებელს დაუმატოთ საგანი.
//    მეთოდს გადაეცემა მასწავლებლის სახელი და საგნის სახელი. ჩათვალეთ, რომ საგნის
//    სახელი უნიკალურია. ერთი და იგივე მასწავლებელი შეიძლება რამდენიმე საგანს
//    კითხულობდეს, ასევე ერთსა და იმავე საგანს შეიძლება რამდენიმე მასწავლებელი
//    კითხულობდეს ერთდროულად.
//    თუკი teacher სახელის მქონე მასწავლებელი არ არის აქამდე დამატებული, მაშინ
//    მეთოდმა არაფერი არ უნდა გააკეთოს.
    public void addSubject(String teacher, String subject){
    	if(!teacherToSubj.containsKey(teacher)){
    		return;
    	}
    	teacherToSubj.get(teacher).add(subject);
    	if(!subjToTeacher.containsKey(subject)){
    		subjToTeacher.put(subject, new HashSet<String>());
    	}
    	subjToTeacher.get(subject).add(teacher);
    }
  
//    addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
//    იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
    public void addPupil(String pupil, String subject){
        if(!pupilToSubj.containsKey(pupil)){
        	return;
        }
        pupilToSubj.get(pupil).add(subject);
        if(!subjToPupil.containsKey(subject)){
        	subjToPupil.put(subject, new HashSet<String>());
        }
        subjToPupil.get(subject).add(pupil);
    }
    
//    getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
//    მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
//    სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
//    დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
//    უნდა დააბრუნოს null.
    public Iterator<String> getTeachers(String pupil){
    	HashSet <String> teachers = new HashSet<String>();
    	if(!pupilToSubj.containsKey(pupil)){
    		return null;
    	}
    	for (String subject : pupilToSubj.get(pupil)) {
			if (subjToTeacher.containsKey(subject)) {
				for (String teacher : subjToTeacher.get(subject)) {
					teachers.add(teacher);
				}
			}
		}
		return teachers.iterator();
    	
    }
    
//    getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
//    მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
//    სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის მქონე
//    ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
    public Iterator<String> getPupils(String teacher){
    	HashSet<String> pupils = new HashSet<String>();
    	if(!teacherToSubj.containsKey(teacher)){
    		return null;
    	}
    	for(String subject: teacherToSubj.get(teacher)){
    		if(subjToPupil.containsKey(subject)){
    			for(String pupil: subjToPupil.get(subject)){
    				pupils.add(pupil);
    			}
    		}
    	}
		return pupils.iterator();
    }
    
//    მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
//    გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი არც
//    ერთი სტუდენტისთვის.
    public void removeTeacher(String teacher){
    	if(!teacherToSubj.containsKey(teacher)){
    		return;
    	}
    	for(String subject: teacherToSubj.get(teacher)){
    		subjToTeacher.remove(subject).remove(teacher);
    	}
    	teacherToSubj.remove(teacher);
    }
}
