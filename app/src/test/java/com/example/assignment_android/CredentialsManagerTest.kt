import com.example.assignment_android.CredentialsManager
import org.junit.Assert.*
import org.junit.Test

class CredentialsManagerTest {


    @Test
    fun givenValidEmail_thenReturnFalse(){
        var credManager = CredentialsManager()
        var testEmail = "input-wrong"
        var isValidEmail = credManager.isValidEmail(testEmail)
        assertEquals(false,isValidEmail)
    }

    @Test
    fun givenValidEmail_thenReturnTrue(){
        var credManager = CredentialsManager()
        var testEmail = "ex123@st.com"
        var isValidEmail_True = credManager.isValidEmail(testEmail)
        assertEquals(true,isValidEmail_True)
    }

    @Test
    fun givenEmptyEmail_thenReturnFalse(){
        var credManager = CredentialsManager()
        var testEmail = "input-wrong"
        var isEmptyEmail = credManager.isEmailEmpty(testEmail)
        assertEquals(false,isEmptyEmail)
    }

    @Test
    fun givenEmptyEmail_thenReturnTrue(){
        var credManager = CredentialsManager()
        var testEmail = ""
        var isEmptyEmail_True = credManager.isEmailEmpty(testEmail)
        assertEquals(true,isEmptyEmail_True)
    }

    @Test
    fun givenPasswordEmpty_thenReturnFalse(){
        var credManager = CredentialsManager()
        var testPassword = "input-wrong"
        var isEmptyPassword = credManager.isPasswordEmpty(testPassword)
        assertEquals(false,isEmptyPassword)
    }

    @Test
    fun givenPasswordEmpty_thenReturnTrue(){
        var credManager = CredentialsManager()
        var testPassword = ""
        var isEmptyPassword_True = credManager.isPasswordEmpty(testPassword)
        assertEquals(true,isEmptyPassword_True)
    }

    @Test
    fun givenFilledPassword_thenReturnFalse(){
        var credManager = CredentialsManager()
        var testPassword = ""
        var isFilledPassword = credManager.isPasswordFilled(testPassword)
        assertEquals(false,isFilledPassword)
    }

    @Test
    fun givenFilledPassword_thenReturnTrue(){
        var credManager = CredentialsManager()
        var testPassword = "input-wrong"
        var isFilledPassword_True = credManager.isPasswordFilled(testPassword)
        assertEquals(true,isFilledPassword_True)
    }
}