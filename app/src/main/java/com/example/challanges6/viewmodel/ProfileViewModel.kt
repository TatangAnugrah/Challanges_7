import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    val userData : MutableLiveData<UserEntity> = MutableLiveData()
    fun dataUser(userEntity: UserEntity){
        userData.postValue(userEntity)
    }
}