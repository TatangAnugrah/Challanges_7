class Repository (private val userDao: UserDao) {

    fun insertData (userEntity: UserEntity): Long {
        return userDao.insertUser(userEntity)
    }

    fun update(userEntity: UserEntity) : Int {
        return userDao.updateUser(userEntity)
    }

}