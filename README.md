[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22754829)
# Lab 05 - DACA + Formatted Output

_Learning Objective: demonstrate an understanding of formatted console output applied to DACA article_


**Given:** 

A couple of weeks back an intern finished a mock-up of an Employment Authorization Card in Java.

```
╔══════════════════════════════════════════════════════════════════════╗
║           UNITED STATES OF AMERICA                                   ║
║                               EMPLOYMENT AUTHORIZATION CARD          ║
║                         Surname                                      ║
║                         CHAPETON-LAMAS                               ║
║    .----.    .----.     Given Name                                   ║
║   (  --  \  /  --  )    NERY                                         ║
║          |  |           USCIS#         Category       Card#          ║
║         _/  \_          012-004-789    C09            SRC9876543210  ║
║        (_    _)         Country of Birth                             ║
║     ,    `--`    ,      Guatemala                                    ║
║     \'-.______.-'/      Terms and Conditions                         ║
║      \          /       None                                         ║
║       '.--..--.'        Date of Birth  Sex                           ║
║         `"""""`         01 JAN 1970    M                             ║
║                         Valid From:    02/02/2020                    ║
║                         Card Expires:  02/02/2022                    ║
║ ascii art by: jgs       NOT VALID FOR REENTRY TO U.S.                ║
╚══════════════════════════════════════════════════════════════════════╝
```

However, the project was passed on to another intern who was charged with cleaning up the original messy code. They were able to:

- Create useful constant variables
- Logically organize declaration/initialization of variables so the code would be ready to be upgraded to input in the future
- Create additional variables to clean up the long print statements, due to concatenating so many pieces of data

They started addressing the spacing but ran into some issues:

- The spacing was fine for the title of the card (top two lines) because that part of the card doesn't change ever. Even some labels would be fine. But for any actual data for the EAC holder, the spaces would be hard-coded to their data
- Numbers for dates, like 01, and USCIS, like 012, are stored as integers so any leading 0's are dropped and don't show up in the output (unless it's hard-coded)

Once they were about to tackle the issues above, they were pulled off the project and it was handed off to you. Lucky!

**Lab ToDo:**

Using what you've learned about formatted output (`System.out.printf` and `String.format`), address the two issues the other intern ran into:

- Fix incorrectly formatted numbers (USCIS# and dates) vs. correctly formatted numbers:
1. `12-4-89` vs. `012-004-789`
2. `1 JAN 1970` vs. `01 JAN 1970`
3. `2/2/2020` vs. `02/02/2020`
4. `2/2/2022` vs. `02/02/2022`
- Dynamically space out data for each line so that the data and sides (`║)` line up, even if there are changes to the cardholders data (ex: given name changes to DENEA). **_Use the mock-up above from the previous intern as a guide._**

**Once you have completed the lab, call over instructor or interns to verify 1) functionality, 2) convention/style, and 3) documentation.**

Done with the lab above? Only then should you attempt the....

**!!!!!Hacker Challenge!!!!!**

- Look up "ANSI Java encoding" and see how you can add colors, bold text, etc. to make the output look even better!
- TIP: use variables efficiently/creatively! If you start modifying print statements things get very messy....