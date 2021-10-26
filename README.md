# DualPaneLayout

Android devices come in all shapes and sizes, so your app's layout needs to be flexible. 
That is, instead of defining your layout with rigid dimensions that assume a certain screen size and aspect ratio,
your layout should gracefully respond to different screen sizes and orientations.



## configuration qualifiers

- Android supports several configuration qualifiers that allow you to control how the system selects your alternative resources 
  based on the characteristics of the current device screen. 

- ex-  1. mipmap-mdpi            (launcher icon for medium-density)
     2. layout-sw600dp         (layout for 7 inch tablets and bigger)
     3. layout-sw600dp-land    (layout for tablets in landscape mode)
    
 
 ### sw,w,h
     
- Say that you have a device that is 600dp x 400dp.
  - sw is the smallest possible width/height,it does not change when the screen orientation change
  - w600dp resource, it will be used in landscape, but not in portrait.
  - sw600dp resource, it will not be used for any orientation (smallest is 400,so it does not work in this case).



- layout-w600dp         (For 7 inch tablets or any screen with 600dp available width)- 
- layout-h600dp         (For 7 inch tablets or any screen with 600dp available height)
     


- In this project, i made a two different layout based on screen size.
  When user see this app in mobile then it will show as first image(i.e left image)
  and if user use this app in tablet then it will show in dualpane form.


![1](https://user-images.githubusercontent.com/52364179/138876170-aae80802-2769-4641-8a34-5a86f89a7aa5.PNG)
