package anagram.sample.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import java.util.*

class AnagramViewModel:ViewModel() {
    var textOne:String=""
    var texttwo:String=""

    /*method for checking Anagram*/

    fun isBothTextAnagram(): Int {
        if(textOne.isNullOrEmpty()){
            return 1
        }else if(texttwo.isNullOrEmpty()){
            return 2
        }else if(Arrays.equals(textOne.chars().sorted().toArray(),
                texttwo.chars().sorted().toArray())){
            return 3
        }else{
            return 4
        }

    }
}