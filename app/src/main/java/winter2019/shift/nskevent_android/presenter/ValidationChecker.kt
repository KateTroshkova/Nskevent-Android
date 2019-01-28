package winter2019.shift.nskevent_android.presenter

import winter2019.shift.nskevent_android.model.Event

class ValidationChecker private constructor() {

    companion object {
        private var instance:ValidationChecker?=null

        fun getInstance():ValidationChecker{
            if (instance==null){
                instance=ValidationChecker()
            }
            return instance!!
        }
    }

    fun isEventValid(event: Event):Boolean=isTitleValid(event.title) &&
            isTextValid(event.text) && isPlaceValid(event.place) &&
            isTimeValid(event.time) && isEmailValid(event.author)

    fun isTitleValid(title:String):Boolean=true
    fun isTextValid(text:String):Boolean=true
    fun isPlaceValid(place:String):Boolean=true
    fun isTimeValid(time:String):Boolean=true
    fun isEmailValid(email:String):Boolean=true
}