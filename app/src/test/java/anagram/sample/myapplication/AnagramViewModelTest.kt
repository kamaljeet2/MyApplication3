package anagram.sample.myapplication

import anagram.sample.myapplication.viewmodel.AnagramViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class AnagramViewModelTest {
    private lateinit var anagramViewModel: AnagramViewModel

    @Before
    fun setUp(){
        anagramViewModel=AnagramViewModel()
        anagramViewModel.textOne="test"
        anagramViewModel.texttwo="etst"
    }
    @Test
    fun checkAnagramLogic(){
        var status:Boolean=false
       var resultCode= anagramViewModel.isBothTextAnagram()
        if(resultCode==3){
            status=true
        }
        assertEquals(status, true)
    }

    @Test
    fun checkForAnyTextIsEmpty(){
        var status:Boolean=false
        var resultCode= anagramViewModel.isBothTextAnagram()
        if(resultCode==1||resultCode==2){
            status=true
        }
        assertEquals(status, false)
    }

}