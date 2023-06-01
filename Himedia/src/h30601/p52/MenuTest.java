package h30601.p52;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(500, 500);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)");
		MenuItem miNewOpen = new MenuItem("새 창(W)");
		MenuItem miOpen = new MenuItem("열기(O)...");
		MenuItem miSave = new MenuItem("저장(S)");
		MenuItem miAnoterSave = new MenuItem("다른 이름으로 저장(A)...");
		MenuItem miOption = new MenuItem("페이지 설정(U)...");
		MenuItem miPrint = new MenuItem("인쇄(P)...");
		MenuItem miDone = new MenuItem("끝내기(X)");
		mFile.add(miNew);
		mFile.add(miNewOpen);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miAnoterSave);
		mFile.addSeparator();
		mFile.add(miOption);
		mFile.add(miPrint);
		mFile.addSeparator();
		mFile.add(miDone);

		Menu mEdit = new Menu("편집(E)");
		
		Menu mForm = new Menu("서식(O)");
		MenuItem miTap = new MenuItem("자동 줄 바꿈(W)");
		MenuItem miFont = new MenuItem("글꼴(F)...");
		mForm.add(miTap);
		mForm.add(miFont);
		
		Menu mView = new Menu("보기(V)");
		Menu miScreen = new Menu("확대하기/축소하기");
		MenuItem miZoom = new MenuItem("확대(I)");
		MenuItem miRiduction = new MenuItem("축소(O)");
		MenuItem miRestore = new MenuItem("확대하기 축소하기 기본값 복원");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("상태 표시줄(S)");
		mView.add(miScreen);
		miScreen.add(miZoom);
		miScreen.add(miRiduction);
		miScreen.add(miRestore);
		mView.add(miStatusbar);
		
		
		Menu mHelp = new Menu("도움말(H)");
		MenuItem miHelp = new MenuItem("도움말 보기(H)");
		MenuItem miFeed = new MenuItem("피드백 보내기(F)");
		MenuItem miMemo = new MenuItem("메모장 보내기(A)");
		mHelp.add(miHelp);
		mHelp.add(miFeed);
		mHelp.addSeparator();
		mHelp.add(miMemo);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mForm);
		mb.add(mView);
		mb.add(mHelp);
		mb.setHelpMenu(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
