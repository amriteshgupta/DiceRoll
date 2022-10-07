Android Interview Questions For Freshers
1. What is Android?
Android is an open-sourced operating system that is used on mobile devices, such as mobiles and tablets. The Android application executes within its own process and its own instance of Dalvik Virtual Machine(DVM) or Android RunTime(ART).

2. What are the features of Android architecture?
Android architecture refers to the various layers in the Android stack. It consists of operating systems, middleware, and applications. Each layer in the Android architecture gives different services to the layer just above it.

The five layers present in the Android stack are:

Linux Kernel - It is responsible for device drivers, device management, memory management, power management, and resource access.
Libraries - There are a set of libraries having open-source Web browser engine WebKit, well-known library libc, libraries to play and record audio and video, SQLite database for sharing of application data and storage, SSL libraries for internet security, etc.
Android Runtime - There are core libraries along with DVM (Dalvik Virtual Machine) or ART(Android RunTime) as runtime which is helpful for running an Android application. DVM is optimized for mobile devices. DVM provides fast performance and consumes less memory. Replacing DVM, ART(Android RunTime) virtual machine was introduced to execute android apps from Android lollipop 5.0 version (API level 21).
Android Framework - It consists of Android APIs like UI (User Interface), resources, content providers (data), locations, telephony, and package managers. It provides interfaces and classes for the development of Android applications.
Android Applications - Applications like home, games, contacts, settings, browsers, etc. uses the Android framework that will make use of Android runtime and libraries.

Android Architecture
3. List the languages used to build Android.
The most popular programming languages that can be used to develop applications in Android are:

Java: It has always been a starting point for new developers and used by the majority of people who work with Android development. Eclipse, NetBeans, and IntelliJ IDE are the most popular IDE’s(Integrated Development Environment) used for developing an Android application using java.
Kotlin: Kotlin is a relatively new, modern, safe, and object-oriented cross-platform programming language used in developing an Android application. IDE’s used with kotlin are Android studio, Eclipse IDE, etc.
C#: Developers can build native iOS and Android mobile applications by using the C# language. Visual Studio is the best tool for developing an Android application using C#.
Python: It is a dynamic and object-oriented programming language. It is very popular in machine learning. Pydroid 3, Dcoder, spck code editor is some of the code editors for Python.
Other languages which can be used in Android development are C++, HTML 5. C4droid, CppDroid, AIDE, etc. are IDE’s for C++. Acode, spck code editor, etc. are examples of IDE’s used with HTML.
You can download a PDF version of Android Interview Questions.

Download PDF

4. What is an activity?
Activity in java is a single screen that represents GUI(Graphical User Interface) with which users can interact in order to do something like dial the phone, view email, etc.

For example, the Facebook start page where you enter your email/phone number and password to log in acts as an activity.

5. What is a service in Android?
Service is an application component that facilitates an application to run in the background in order to perform long-running operations without user interaction. A service can run continuously in the background even if the application is closed or even after the user switches to another application.

6. Differentiate Activities from Services.
Activities can be terminated or closed anytime the user wishes. On the other hand, services are designed to run in the background, and they can act independently.

Most of the services run continuously, irrespective of whether there are certain or no activities being executed.

Activities	Services
They are designed to run in the foreground.	These are mainly designed to run in the background. Foreground services are also available.
Used when the user interface is necessary.	Used when the user interface is not necessary.
They are dependent.	They act independently.
7. What is Google Android SDK? Which are the tools placed in Android SDK?
The Google Android SDK is a toolset used by developers to write applications on Android-enabled devices.

The tools placed in Android SDK are given below:

Android Emulator - Android Emulator is a software application that simulates Android devices on your computer so that you can test the application on a variety of devices and Android API levels without having each physical device.
DDMS(Dalvik Debug Monitoring Services) - It is a debugging tool from the Android software development kit (SDK) which provides services like message formation, call spoofing, capturing screenshots, etc.
ADB(Android Debug Bridge) - It is a command-line tool used to allow and control communication with the emulator instance.
AAPT(Android Asset Packaging Tool) - It is a build tool that gives the ability to developers to view, create, and update ZIP-compatible archives (zip, jar, and apk).
8. What is the use of Bundle in Android?
Bundles are used to pass the required data between various Android activities. These are like HashMap that can take trivial data types. Below code shows how to transfer a piece of data by using bundle:

Bundle b=new Bundle();
b.putString("Email","abc@xyz.com");
i.putExtras(b); // where i is intent
9. What is an Adapter in Android?
An adapter in Android acts as a bridge between an AdapterView and the underlying data for that view. The adapter holds the data and sends the data to the adapter view, the view can take the data from the adapter view and shows the data on different views like a spinner, list view, grid view, etc.

10. What is AAPT?
AAPT stands for Android Asset Packaging Tool. It is a build tool that gives the ability to developers to view, create, and update ZIP-compatible archives (zip, jar, and apk). It parses, indexes, and compiles the resources into a binary format that is optimized for the platform of Android.

11. What is portable Wi-Fi hotspot?
Portable Wi-Fi Hotspot permits you to share your mobile internet connection with other wireless devices. For example, using your Android phone as a Wi-Fi hotspot, you can use your laptop to connect to the internet using that access point.

12. What is Android Debug Bridge(ADB)?
Android Debug Bridge is a command-line tool used to allow and control communication with an emulator instance. It gives the power for developers to execute remote shell commands to run applications on an emulator.

13. What is DDMS?
DDMS(Dalvik Debug Monitor Server) is a debugging tool in the Android platform. It gives the following list of debugging features:

Port forwarding services.
Thread and heap information.
Logcat.
Screen capture on the device.
Network traffic tracking.
Incoming call and SMS spoofing.
Location data spoofing.
14. What is AIDL? Which data types are supported by AIDL?
AIDL(Android Interface Definition Language) is a tool that handles the interface requirements between a client and a service for interprocess communication(IPC) to communicate at the same level.

The process involves dividing an object into primitives that are understood by the Android operating system. Data Types supported by AIDL is as follows:

String
List
Map
CharSequence
Java data types (int, long, char, and boolean)
Android Intermediate Questions
15. What is the life cycle of Android activity?
OnCreate(): It is called when activity is created. Using this, the views are created and data is collected from bundles.
OnStart(): It is called if the activity is becoming visible to the user. It may be succeeded by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.
OnResume(): It is called when the activity will start an interaction with the user.
OnPause(): This is called when the activity is moving to the background but hasn’t been killed yet.
OnStop(): This is called when an activity is no longer visible to the user.
OnDestroy(): This is called when the activity is finished or destroyed.
OnRestart(): This is called after the activity has been stopped, prior to it being started again.

Life Cycle of Android
16. Explain Sensors in Android.
Android-based devices have a collection of built-in sensors in them, which measure certain parameters like motion, orientation, and many more through their high accuracy. The sensors can be both hardware and software based on nature. There are three prominent categories of sensors in Android devices. They are:

Position Sensor: It is used for measuring the physical position of the Android device. This has orientation sensors and magnetometers.
Motion Sensors: These sensors consist of gravity, rotational activity, and acceleration sensors which measure the rotation of the device or the acceleration, etc.
Environmental Sensor: It includes sensors that measure temperature, humidity, pressure, and other environmental factors.
17. Explain the dialog boxes supported on Android.
Android supports four dialog boxes. They are:

AlertDialog:
The AlertDialog supports 0-3 buttons, along with a list of selectable items such as checkboxes and radio buttons.
It is used when you want to ask the user about taking a decision between yes or no in response to any particular action taken by the user, by remaining in the same activity and without changing the screen.
DatePickerDialog:
It is used for selecting the date by the user.
TimePickerDialog:
Used for selecting the time by the user.
ProgressDialog:
It is an extension of the AlertDialog and is used to display a progress bar. It also supports the addition of buttons.
This class was deprecated in API level 26 because it prevents the user from interacting with the application. Instead of this class, we can use a progress indicator such as ProgressBar, which can be embedded in the user interface of your application.
18. What is AndroidManifest.xml file and why do you need this?
The AndroidManifest.xml file contains information regarding the application that the Android system must know before the codes can be executed.
This file is essential in every Android application.
It is declared in the root directory.
This file performs several tasks such as:
Providing a unique name to the java package.
Describing various components of the application such as activity, services, and many more.
Defining the classes which will implement these components.
19. What is an intent?
An intent is a messaging object that is used to request an action from other components of an application. It can also be used to launch an activity, send SMS, send an email, display a web page, etc.

It shows notification messages to the user from within an Android-enabled device. It alerts the user of a particular state that occurred. There are two types of intents in Android:

Implicit Intent- Used to invoke the system components.
Explicit Intent- Used to invoke the activity class.

Types Of Intents
20. Mention the difference between class, file and activity in Android?
The difference between them is as follows:

Class is a compiled form of a .java file that Android uses to produce an executable .apk file.
A file is a block of arbitrary information or resources used for storing information. It can be of any file type.
Activity is a single screen that represents GUI(Graphical User Interface) with which users can interact in order to do something like dial the phone, view email, etc.
21. What is a Toast? Write its syntax.
Toast is a message that pops up on the screen. It is used to display the message regarding the status of the operation initiated by the user and covers only the expanse of space required for the message while the user’s recent activity remains visible and interactive.

Toast notification automatically fades in and out and it does not accept interaction events.

Syntax:

Toast.makeText(ProjectActivity.this, "Your message here", Toast.LENGTH_LONG).show();
22. What is context?
The context in Android is the context of the current state of the application or object. The context comes with services like giving access to databases and preferences, resolving resources, and more.

There are two types of context. They are:

Activity context

This activity context is attached to the lifecycle of an activity.
The activity context can be used when you are passing the context in the scope of an activity or you need the context whose lifecycle is attached to the context of the activity.
Application context:

This application context is attached to the lifecycle of an application.
The application context should be used where you need a context whose lifecycle is separate from the current context or when you are passing a context beyond the scope of activity.

Types of Context
23. Explain the difference between Implicit and Explicit Intent.
The difference between the implicit and explicit Intents are given below:

Explicit Intent:

An Explicit Intent is where you inform the system about which activity should handle this intent. Here target component is defined directly in the intent.

For example,

Intent i = new Intent(this, Activitytwo.class); #ActivityTwo is the target component
i.putExtra("Value1","This is ActivityTwo"); 
i.putExtra("Value2","This Value two for ActivityTwo"); 
startactivity(i);
Implicit Intent:

An Implicit Intent permits you to declare the action you want to carry out. Further, the Android system will check which components are registered to handle that specific action based on intent data. Here target component is not defined in the intent.
