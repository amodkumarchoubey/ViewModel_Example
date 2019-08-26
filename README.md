# ViewModel_Example
ViewModel Architecture components



	It survives configuration changes like Rotation.




	Used to save large amount of data like bitmap ,listdata.





	It store and manage UI related data.





	Destroyed  if owner activity is completely destroyed in oncreate().




	Communication layer between UI and DB.




	is a class that is responsible for preparing and managing the data for an Activity or a
Fragment . It also handles the communication of the Activity / Fragment with the rest of the application .




	why we go for ViewModel because when user rotate screen all data is loss.




	ViewModel is an Android architecture component. It is used as a data manager in the application.




	 To use ViewModel, we need to firstly add proper dependencies into our app/build.gradle app/build.gradle .





	implementation "android.arch.lifecycle:extensions:1.1.1"
	








