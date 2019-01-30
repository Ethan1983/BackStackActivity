# BackStackActivity
Back stack test with persistableMode

Back stack is not being restored after device reboot when all activities of the back stack requests
persistAcrossReboots as persistableMode. The entire activity stack (including both MainActivity and TabActivity)
should be restored and displayed after device reboot. It is indeed restored for the case when the process is
killed by low memory killer and user resumes the app from recent apps overview screen (without any device reboot).

Instructions

1) Compile and Launch the app ( MainActivity should display "Constructed Text" )
2) Click on the text
3) TabActivity should be displayed with "Constructed Tab Text"
4) Press home button to ensure activity state is saved
5) Restart the device
6) After device restart, use recent apps overview and resume this application
