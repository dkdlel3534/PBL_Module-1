import java.io.* ; 
import java.util.* ; 
import myClass.* ; 
import DataBase.* ; 

/**
 * LibraryManagementSystem 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤)
 * @version (2026-10-10)
 */
public class LibraryManagementSystem
{
    // 속성 
    public LibDB<Book> bookDB ;
    public LibDB<User> userDB ; 
    public HashMap<User,Book> loanDB; 

    /**
     * LibraryManagementSystem 클래스의 객체 생성자
     */
    public LibraryManagementSystem()
    {
        bookDB = new LibDB<Book> () ;
        userDB = new LibDB<User> () ; 
        loanDB = new HashMap<User,Book> (); 
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public void borrowBook(String userID, String bookID)
    {

    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public <T extends DB_Element> void printDB(LibDB<T> db)   // 제네릭 메소드 
    {

    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void printLoanList() 
    {
        // 여기에 코드를 작성하세요

    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public LibDB<Book> setBookDB(String bookFile)
    {
        
        
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public LibDB<User> setUserDB(String userFile) 
    {
        
    }
}