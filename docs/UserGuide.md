## Table of contents

1. Overview
2. How to use this guide
3. Getting started
4. Feature list
5. Command summary
6. Trouble shooting/FAQ
7. Additional information

---

## About HMHero

In a conventional application cycle, the large influx of applicants makes it challenging for Hiring Managers to track and monitor the progress of each applicant.

HMHero is an Applicant Managing System designed to be used by human resource professionals, hiring managers, and recruiters who want to streamline the recruitment process and make it more efficient, helping their organizations manage job applications and hiring processes more effectively. 

As a hiring manager, you can easily track applicant progress. HMHero allows you to store all applicant information in one centralized location, making it easy to filter applicants based on skillsets to find the right applicant for your job.

In addition, HMHero provides analytics regarding your hiring process, such as turnover rate and average time taken to process each applicant. With HMHero, hiring managers can gain further insight on their hiring process, empowering them to make smart decisions to streamline their hiring process.

---

## Features

There are two core features that HMHero provides:

- Applicant Management System
- Hiring Process Analytics

#### Applicant Management System

HMHero empowers you to manage applicants during hiring process.

1. Easily add, edit, delete, and view your applicants.
2. Quickly advance applicants through application statuses or reject them.
3. Filter shortlisted applicants and sort them by interview date.
4. Filter all applicants based on their skillsets.
5. View all applicants that have interviews coming up in three days.

#### Hiring Process Analytics

HMHero provides straightforward analysis on your hiring process to streamline and make your hiring process more efficient.

1. Find out how many applicants are accepted out of total applicants.
2. Find out the average time taken to process each applicant.

[Back to Table of Contents](#table-of-contents)

---

## 2. How to use this User Guide

Thank you for choosing HMHero! We believe that our product will be of use in the journey of your company's growth.

<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong>
We highly recommend that you read through this User Guide in **sequential order** to get a thorough understanding
of how to use HMHero.
</div>

If you are a **new user**, and you have not installed HMHero yet, head over to the [Installation](#installation)
section.

Once HMHero is installed, you can find the necessary information to get started in the [Quick Start](#quick-start)
section!
This includes:
* The [User Interface](#user-interface) of HMHero
* How each `Applicant` is represented
* HMHero's Command Format
* Trying out your very first HMHero command

If you are an **experienced user**, you may head over to the [Command Summary](#command-summary) to get a quick overview
of all the commands available in HMHero!

If you are stuck, please refer to the section on [Troubleshooting](#troubleshooting) or [FAQ](#faq).

You can also refer to the [Glossary](#glossary) for definitions of commonly used terminologies in HMHero.

<div markdown="span" class="alert alert-success" role="alert">:bulb: <strong>Tip:</strong>
To aid in your navigation, we have included the a [Back to Table of Contents](#table-of-contents) link in every
sub-section in this User Guide so that it is easy for you to jump across different sections!
</div>

<div markdown="span" class="alert alert-success" role="alert">:bulb: <strong>Tip:</strong>
This User Guide contains many clickable links for you to navigate around different sections.
You may use the keyboard shortcuts <code>Alt + Left arrow`</code>  and <code>`Alt + Right arrow`</code>
to navigate back and forth between the links quickly. (<code>Command + Left arrow`</code> and
<code>`Command + Right arrow`</code> if you are using Mac).
</div>

[Back to Table of Contents](#table-of-contents)

#### Admonition Boxes

In this guide, you will often come across colored boxes containing text that will aid you in better understanding
how to use each feature.

<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong>
Highlight and display information you should pay attention to. </div>


<div markdown="span" class="alert alert-success" role="alert">:bulb: <strong>Tip:</strong>
Highlight tips which you might find useful. </div>


<div markdown="span" class="alert alert-danger" role="alert">:exclamation: <strong>Caution:</strong>
Highlight dangers and things to look out for. </div>

[Back to Table of Contents](#table-of-contents)

### Miscellaneous Notations

Other than the icons mentioned above, there are also some other notations used in this guide:

- <a href> Phrases underlined in blue </a> are hyperlinks that will bring you to another part of
this documentation that is relevant to the phrase.

[Back to Table of Contents](#table-of-contents)

---
## Getting started

1. Ensure you have  or above installed in your computer
2. Download the latest `HMHero` from [here](https://github.com/AY2223S2-CS2103T-W14-4/tp/releases).
3. Copy the file to an empty folder. This folder is where all the information needed for the HMHero application
will reside in.

<div markdown="span" class="alert alert-danger" role="alert">:exclamation: <strong>Caution:</strong>
Ensure that the file is added to an empty folder as additional data and configuration files will be created when HMHero
is launched for the first time in your computer!
</div>
4. Double-click on the jar file to launch HMHero.
5. A GUI similar to the one below should appear in a few seconds. Note how the app contains some sample data.

**(To Insert Picture of Launch Screen)**

<div markdown="span" class="alert alert-danger" role="alert">:exclamation: <strong>Caution:</strong>

You will notice that a folder called "data" would have been created in the same folder as <code>hmhero.jar</code>.
Do not edit this file because doing so might result in a corruption of your data, causing the application to fail!
</div>


Not sure where to start? The following section on [Quick Start](#quick-start) is a tutorial on how to use HMHero
after you have launched it for the first time. Feel free to skip to the next section on [Command](#command) if you
are already familiar with the application!

[Back to Table of Contents](#table-of-contents)


---


## 5. Quick Reference Guide
This section covers everything you should know about HMHero, as well as a [tutorial]() on trying your first command.
Of special note is the [Key Definitions]() and [Command Format]() sections, which covers essential knowledge to using
HMHero's features.

### 5.1 Layout
When you launch HMHero, HMHero appears on your screen as a Graphical User Interface(GUI). Let's explore the
layout of the different components of HMHero.

HMHero's GUI consists of a single main window consisting of 3 main sections.
1. Command Input Box
2. Command Result Box
3. Applicant List Box

The following picture of the main window shows the three components, numbered accordingly:
![components.png](images%2Fcomponents.png)

Besides the main window, HMHero also has the Help Window. It is not part of the main GUI and is only
shown after a [Help Command]() is run.

The Help Window looks like the following:

![help_window.png](images%2Fhelp_window.png)

### 5.2 Key Definitions

#### 5.2.1 Applicant

An applicant in HMHero represents an individual that applied for a job at your company. HMHero tracks various
attributes of an applicant. Compulsory attributes would include their name, phone number, address and email.

The following are the attributes stored for each `Applicant`
* Name
* Phone Number
* Address
* Email
* Notes

Applicants are unique by name and phone number and Case Sensitive.
This means you cannot add two or more applicants of the same name and phone number.

### 5.2.2 Notes

A note in HMHero serves as a means of labelling the skills of an applicant. These tags
are unique and case-sensitive.

We can tag multiple applicants with the same note and each applicant can have multiple notes. These notes
are optional.

Feel free to make use of notes as you fit to highlight skill-sets of an applicant. Examples of such notes
can include:
* Highlight applicant's:
  * Technical proficiency, e.g. `Python`, `Java`, `Flask`
  * Soft Skills, e.g. `Project Management`, `Event Planning`

HMHero's Notes are unique by name and are case-sensitive. This means you cannot add two or more notes of
the same name.

### 5.2.3 Flags
Flags are delimiters that enable HMHero to distinguiseh different parameters without ambiguity.

You could put in the corresponding [Placeholder](#524-placeholders) immediately after each flag.

<div markdown="span" class="alert alert-success" role="alert">:bulb: <strong>Tip:</strong>
You may find the following image taken from the subsequent <a href> Command Format </a> section helpful:
<img src="/Users/merrick/Documents/NUS/Y2S2/CS2103T/tp/docs/images/CommandExample.png">
</div>

Placeholders in this User Guide refers to the UPPER_CASE words that can be replaced by valid user input supplied.
These placeholders follow immediately after a [Flag](#623-flags).

| Action | Corresponding Placeholder |
|--------|---------------------------|
| n/     | `NAME`                    |
| p/     | `PHONE`                   |
| e/     | `EMAIL`                   |
| a/     | `ADDRESS`                 |
| note/  | `NOTE`                    |
| d/     | `DATETIME`                |

Please refer to the subsequent [Command Format]() section to see how [Flags](#623-flags)
and [Placeholders](#624-placeholders) are used together.

### 5.2.4 Placeholders
Placeholders in this User Guide refers to the UPPER_CASE words that can be replaced by valid user input supplied.
These placeholders follow immediately after a [Flag](#523-flags).

Please refer to the subsequent [Command Format](#53-command-format) 
section to see how Flags and Placeholders are used together.

| Placeholder  | Corresponding Flag | Description                                                                                  |
|--------------|--------------------|----------------------------------------------------------------------------------------------|
| INDEX        | (Not Applicable)   | The INDEX of an item is the number to the left of the applicant's name in the Item List Box. |
| NAME         | n/                 | The NAME is the name we use to identify an Applicant.                                        |
| PHONE        | p/                 | The PHONE is the text we use to represent the phone number of the Applicant.                 |
| EMAIL        | e/                 | The EMAIL is the text we use to represent the email of the Applicant.                        |
| NOTE         | note/              | The NOTE is the term we use to identify a skill of an Applicant.                             |
| DATETIME     | d/                 | The DATETIME is the datetime indicating the interview datetime of the Applicant.             |

### 5.3 Command Format
You will encounter HMHero commands throughout this User Guide.
Before you delve into the different commands in Commands, let’s learn what a command consists of.

Here is an example:
![CommandExample.png](images%2FCommandExample.png)
A command consists of:
Command Word: Tells HMHero what action you wish to execute. These actions are covered in [Commands]().
[Flags](#523-flags): Distinguishes between inputs. A flag is usually followed by a placeholder.
[Placeholders](#524-placeholders): Represents data that you wish to input. Replace this with valid data.
For example, ITEM_NAME in n/ITEM_NAME can be replaced with n/Potato.


## Trying your first command

To let you become more familiar with HMHero, let's practise executing some commands.

To start off, let's try out the `add` command! This command lets you add an [applicant](#521-applicant) to HMHero.

One of the available commands in HMHero is the command to create a new applicant.

**Format:** `add n/NAME p/PHONE e/EMAIL a/ADDRESS [note/NOTE]`
<br>
<br>

**What does the format mean?**
* `add` tells HMHero that this is the command to create a new applicant
* [Flags](#523-flags) such as `n/` and `p/` are delimiters that enable HMHero to distinguish different
parameters supplied by you without ambiguity
* [Placeholders](#524-placeholders) such as `NAME` and `PHONE` shows you what you should place in each portion of the 
command

Notice that there is a pair of square brackets `[]` surrounding some parameters like `note/NOTE`
in the format. This indicates that the parameter is **optional**. Each of these placeholders in the parameters 
have a default value based on the commands. These are documented in the [Commands](#commands) section for each command.


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
The [Placeholder](#placeholders) section covers the restrictions for respective placeholders. For example, 
the date format of PHONE, certain characters you cannot use and the limit and precision of numbers. 
</div>

**Let's try an example!**

Suppose you just add Thomas, 91918153, thomas@gmail.com, living at 6 Sims Drive (s)543230 and you do not
feel the need to record a note for this applicant.

`NAME`: Thomas

`PHONE`: 91918153

`EMAIL`: thomas@gmail.com

`ADDRESS`: 6 Sims Drive (s)543230

The command you would like to enter into the command box would be:

```add n/Thomas p/91918153 e/thomas@gmail.com a/6 Sims Drive (s)543230```
<br> <br>

Alternatively, executing these would do the same thing:

* ```add n/Thomas e/thomas@gmail.com p/91918153 a/6 Sims Drive (s)543230```

  This is because the order of the flags does not matter.
<br> <br>

* ```add n/Thomas p/91918153 e/thomas@gmail.com n/Sally p/97833468 a/6 Sims Drive (s)543230```

  In this case, the name "Thomas" will be overridden by "Sally", and the phone "91918153" 
will be overridden by "97833468".
<br> <br>

However, note that the following executions are invalid:

* ```addn/Thomasp/91918153e/thomas@gmail.coma/6 Sims Drive (s)543230```

  There must be between the placeholders and flags.

* ```add n/ThomaŚ p/91918153 e/thomas@gmail.com a/6 Sims Drivè (s)543230```

  The restrictions of placeholders are not followed.

* ```add```

  There is insufficient information provided; you must minimally provide a name.

Find out more about restrictions in the sections [Flags](#523-flags), [Placeholders](#524-placeholders) 
and [Commands](#commands).

---


Let's try out another command -- the `list` command! `list` lets you see the list of the applicants.

<div markdown="span" class="alert alert-danger" role="alert">:exclamation: <strong>Caution:</strong> <br>
The format for different commands are not always identical. For example, executing the `add` command and the `list` 
command will have different formats! 
</div>

For example, after adding an applicant, you decided to see the list of applicant.

**Format:** `list`

The command you would like to enter into the [Command Input Box](#51-layout) would be:

```list```

You should now have a better understanding of how commands are formatted and used. All commands are consolidated
in the [Command Summary](#command-summary).

Here is a checklist you can use before running a command:

* [ ] I know the restrictions of the command
* [ ] I know what parameters are supplied to the command
* [ ] I know the flags for each parameter to be supplied
* [ ] I know the restrictions of each parameter
* [ ] I know the effects of not specifying each optional flag.

## Commands

This section shares with you on how to use each command in detail.

Before continuing, ensure you have read the section on [Flags](#523-flags) and [Placeholders](#524-placeholders).

What you should expect to find:

* A description of the command
* The format of the command
* The expected behaviour of the command
* A few valid and invalid examples of the command
* Important points to note


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
<ul> For each command, "Format" indicates the syntax of the command. </ul> 
<ul> Square brackets indicates an optional parameter. </ul> 
<ul> In most commands, if the same parameter is repeated and only one is required, we take the last value provided. 
</ul> </div>

### Applicant Commands

#### Create a new applicant: `add`

**Format**: `add n/NAME p/PHONE e/EMAIL a/ADDRESS [note/NOTE]`

> Creates a new applicant with the provided information

**Info**
* All fields apart from `NOTE` are compulsory.
* All `NAME` and `PHONE` must be unique.
* `NAME` is case-sensitive. (e.g. "Thomas" is different from "thomas").
* `PHONE` does not require you to include the country code. Only include the numbers.
* The value of `NOTE` will be `-` if it is not provided.


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
<ul> If two or more values of the same parameter are provided, only the last value for that parameter will be taken.
</ul> </div>


**Example:**

**Assumption:**

HMHero does not already contain an applicant with the name "Thomas".

**Command Input Box:**

```add n/Thomas p/91918153 e/thomas@gmail.com a/6 Sims Drive (s)543230```

**Command Output Box:**
```
New person added: Thomas; Phone: 91918153; Email: thomas@gmail.com; 
Address: 6 Sims Drive (s)543230; Status: APPLIED
```

---


#### Search for an applicant: `find`

**Format**: `find n/[KEY] p/[KEY] note/[KEY]`

> Finds all applicants in HMHero using name, phone, note or all

**Info**
* The notation `[KEY]...` means that we take in name or phone or note or all.
  In this case, at least one `KEY` is required.
* The `n/[KEY]` and `note/[KEY]` [are case-insensitive. (e.g. "apples" will match "Apples").
* The result will be applicants where each of the `KEY` are present in the `NAME` or `PHONE` or `NOTE`.
  (e.g. "Thomas" will match "Thomas Lee", "Thomas", "Thomas Tan" and "Thomas Lim",
  "91918153" will only match "91918153", "java" will match "java" and "javas")


<div markdown="span" class="alert alert-success" role="alert">:bulb: <strong>Tip:</strong> <br>
<ul> You can use the [List Command](#List) in the next section to display all applicants again!
</ul> </div>


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
<ul> The `find` command only finds `Applicants` which has a name, phone or both that fully matches the specified search
  of part of the name, phone or both! </ul>
<ul> This means that if the `NAME` `Thomas Lee` and `Thomas Tan` is in HMHero,
  executing `Thomas` will find these two `Applicants`. </ul>
<ul> This also means that if the `PHONE` `91918153` and `9191` is in HMHero, executing `91918153` will only find
  `PHONE` `91918153`. </ul>
<ul> If you try to find an `NAME` `Thomas` by executing the command `Thomas Lee`, it will still work! </ul>
<ul> However, if you try to find an `PHONE` `91918153` by executing the command `919181532`, it will not work! </ul>
<ul> If you try to find `Applicants` using both `NAME` and `PHONE`, it will work the same as finding individually! </ul>
</div>

**Example:**

**Assumption:**

HMHero contains the following applicants:

1. Thomas Tan, 91918153
1. Thomas, 98765432
1. Marry, 98765432
1. Thoma, 98231234

**Command Input Box:**

```find n/Thomas p/98765432```

**Command Output Box:**

```
2 persons listed

1. Thomas, REJECTED, 98765432, thomas@gmail.com, 6 Sims Drive (s)543230
2. Marry, APPLIED, 98765432, marry@gmail.com, 5 Sims Drive (s)542333
```
---


#### List all applicants: `list`

**Format**: `list`

> List all applicants in HMHero

**Info**
* This command is useful to view all applicants again after using the [Find Command](#search-for-an-applicant--find).


**Example:**

**Assumption:**

HMHero contains the following applicants, each with their own attributes:

1. Thomas Tan, 91918153
1. Thomas, 98765432
1. Marry, 98765432
1. Thoma, 98231234

**Command Input Box:**

```list```

**Command Output Box:**
```
- Listed all applicants
- Total Applicants: 4
- Applied: 1
- Shortlisted: 1
- Accepted: 1
- Rejected: 1

1. Thomas, REJECTED, 98765432, thomas@gmail.com, 6 Sims Drive (s)543230
2. Marry, APPLIED, 98765432, marry@gmail.com, 5 Sims Drive (s)542333
3. Thomas Tan, ACCEPTED, 91918153, thomastan@gmail.com, 4 Sims Drive (s)543231
4. Thoma, SHORTLISTED, 98231234, thoma@gmail.com, 7 Sims Drive (s)543521
```
---


#### Delete an applicant: `delete`

**Format**: `delete n/NAME p/PHONE`

> Deletes an applicant in HMHero using name and phone

**Info**
* All fields are compulsory.


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
* The `delete` command only deletes `Applicant` which has a name and phone that fully matches the specified search.
</div>


**Example:**

**Assumption:**

HMHero contains the following applicants, each with their own attributes:

1. Thomas Tan, 91918153
1. Thomas, 91918153
1. Marry, 98765432
1. Thoma, 98231234

**Command Input Box:**

```delete n/Thomas p/91918153```

**Command Output Box:**

```
Deleted Person: Thomas; Phone: 91918153; Email: thomas@gmail.com; 
Address: 6 Sims Drive (s)543230; Status: REJECTED`
```

---


#### Advance an applicant: `advance`

**Format**: `advance n/NAME p/PHONE [d/INTERVIEW DATETIME]`

> Advances an applicant in HMHero using name, phone and interview datetime

**Info**
* All fields except [INTERVIEW DATETIME] are compulsory.
* [INTERVIEW DATETIME] is compulsory when the initial `status` is `APPLIED`.


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
<ul> The `advance` command only advances `Applicant` which has a name and phone that fully matches the specified search.
</ul> 
<ul> The `INTERVIEW DATETIME` is required to advance `Applicant` from `status` `APPLIED` to `status` `SHORTLISTED`.
</ul> 
<ul> However, `INTERVIEW DATETIME` is not required to advance `Applicant` from `status` `SHORTLISTED`
  to `status` `ACCEPTED`. </ul>
<ul> The format for `INTERVIEW DATETIME` should follow: "dd-mm-yyyy HH:MM".
<ul> “dd”: Day of the month. For example, “10” would represent the 10th day of the month. </ul>
<ul> “mm”: Month of the year, ranging from 1 to 12 for January to December respectively. 
    For example, “05” would represent May. </ul>
<ul> “yyyy”: A 4-digit year. For example, “2023” would represent the year 2023. </ul>
<ul> "HH": Hour of the day, ranging from 0-23 in 24-hour clock format. 
    For example, "15" would represent 15th hour of the day. </ul>
<ul> "MM": Minute of the day, ranging from 0-59. For example, "50" would represent the 59th minute of the hour. </ul> 
</ul>
</div>


**Example:**

**Assumption:**

HMHero contains the following applicants, each with their own attributes:

1. Thomas Tan, 91918153, SHORTLISTED
1. Thomas, 91818153, APPLIED

**Command Input Box:**

1. ```advance n/Thomas p/91918153 d/20-03-2023 12:12```

1. ```advance n/Thomas Tan p/91818153```

**Command Output Box:**
```
1. Advanced Applicant: Thomas

Thomas, SHORTLISTED 20-03-2023 12:12, 91918153, thomas@gmail.com, 6 Sims Drive (s)543230

2. Advanced Applicant: Thomas Tan

Thomas, ACCEPTED, 91918153, thomas@gmail.com, 6 Sims Drive (s)543230
```
---


#### Reject an applicant: `reject`

**Format**: `reject n/NAME p/PHONE

> Rejects an applicant in HMHero using name and phone

**Info**
* All fields are compulsory.


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
<ul> The `reject` command only rejects `Applicant` which has a name and phone that fully matches the specified search.
</ul> 
<ul> The `NAME` and `PHONE `is required to reject `Applicant` from `status` `APPLIED`, `SHORTLISTED` and `ACCEPTED`
  to `status` `REJECTED`. </ul> </div>


**Example:**

**Assumption:**

HMHero contains the following applicants, each with their own attributes:

1. Thomas Tan, 91918153, SHORTLISTED
1. Thomas, 91818153, APPLIED

**Command Input Box:**

```reject n/Thomas p/91918153 d/20-03-2023 12:12```

**Command Output Box:**

```
Rejected Applicant: Thomas

1. Thomas, REJECTED 20-03-2023 12:12, 91918153, thomas@gmail.com, 6 Sims Drive (s)543230
```
---

#### List all interview dates of applicants: `interview`

**Format**: `interview`

> List all interview dates of shortlisted applicants in HMHero in chronological order

**Info**
* This command is useful to view all the applicants' interview dates again after
  using the [Advance Command](#advance-an-applicant--advance).


**Example:**

**Assumption:**

HMHero contains the following applicants, each with their own attributes:

1. Thomas Tan, SHORTLISTED 19-03-2023 12:12, 91918153,
1. Thomas, SHORTLISTED 18-03-2023 12:12, 98765432
1. Marry, SHORTLISTED 21-03-2023 12:12, 98765432

**Command Input Box:**

```interview```

**Command Output Box:**
```
Listed all shortlisted applicants

1. Thomas, SHORTLISTED 18-03-2023 12:12, 98765432, thomas@gmail.com, 6 Sims Drive (s)543230
2. Thomas Tan, SHORTLISTED 19-03-2023 12:12, 91918153, thomastan@gmail.com, 4 Sims Drive (s)543231
3. Marry, SHORTLISTED 21-03-2023 12:12, 98765432, marry@gmail.com, 5 Sims Drive (s)542333
```
---


#### Edit an existing applicant: `edit`

**Format**: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [d/INTERVIEW DATETIME] [note/TAG]`

> Edits an existing applicant with the provided information

**Info**
* If two or more values of the same parameter are provided, only the last value for that parameter will be taken.
* However, if two or more values of `TAG` are provided, both parameter will be taken in.

<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
<ul> All fields apart from `INDEX` are optional. However, you need to include at least one optional parameter. </ul>
<ul> The format for `INTERVIEW DATETIME` should follow: "dd-mm-yyyy HH:MM".
<ul> “dd”: Day of the month. For example, “10” would represent the 10th day of the month. </ul>
<ul> “mm”: Month of the year, ranging from 1 to 12 for January to December respectively.
For example, “05” would represent May. </ul>
<ul> “yyyy”: A 4-digit year. For example, “2023” would represent the year 2023. </ul>
<ul> "HH": Hour of the day, ranging from 0-23 in 24-hour clock format. 
For example, "15" would represent 15th hour of the day. </ul>
<ul> "MM": Minute of the day, ranging from 0-59. For example, "50" would represent the 59th minute of the hour. </ul> 
</ul>
</div>


**Example:**

**Assumption:**

* The currently displayed `list` in HMHero shows the applicant named "Thomas Tan" at INDEX value 1.
* Initially, the "Thomas Tan" applicant has the following values:
  * Phone: 91918153
  * Email: thomastan@gmail.com
  * Address: 7 Sims Drive (s)543212
  * Interview DateTime: 24-06-2023 15:15
  * Tag: C


**Command Input Box:**

```edit 1 p/97833468 n/Tammy note/Python note/Java```

**Command Output Box:**
```
Edited Person: Tammy; Phone: 97833468; Email: thomastan@gmail.com;
Address: 7 Sims Drive (s)543212; Status: SHORTLISTED; Tags: [Python] [Java]
```

---


#### Remind on applicant's interview date: `remind`
- Will update soon


### Statistics Command

- Will update soon

### General Commands

#### Receive help during usage: `help`

**Format**: `help [COMMAND_WORD]`

> Displays help for HMHero


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
COMMAND_WORD is strictly any of the following:
</div>

* exit
* help
* add
* delete
* edit
* find
* interview
* list
* advance
* reject
* remind (implementing)
* stats (implementing)


**Example:**

**Command Input Box:**

Possible inputs:
```
help
```
```
help delete
```
```
help help
```

**Help Window:**

The Help Window will open showing the instructions.

If no `COMMAND_WORD` was specified, only a general help message will be provided. The general help message
shows a list of commands available to the user and a URL to this User Guide.

If a `COMMAND_WORD` was specified, additional help for that command will be provided.

- Format:
  - Format 1: `find NAME or PHONE NUMBER or NOTE` (only need to provide one)
  - Format 2: `find n/NAME p/PHONE NUMBER` (must provide both)
- Example:
  - Example 1: `find Jack Dill`, `find 91234567`
  - Example 2: `find n/Jack Dill p/91234567`

---

#### Exit HMHero: `exit`

**Format**: `exit`

> Exits HMHero

```warning
This command is the only guaranteed way for the data file to be saved when you exit the application.
To prevent, always exit the application using this command instead of any other way.
```

**Example:**

**Command Input Box:**

Possible inputs:
```
exit
```

**Expected Outcomes:**

* All HMHero application windows will close
* Your inventory data is saved.


<div markdown="span" class="alert alert-info" role="alert">:information_source: <strong>Note:</strong> <br>
If your inventory data cannot be saved successfully, HMHero will not close in order to prevent data loss.
</div>


## Command Summary

### Applicant Commands
 Action                                 | Format                                                                                                                                                                            | Example                                                                     |
|----------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| Add a new applicant                    | `add n/NAME p/PHONE e/EMAIL a/ADDRESS [note/TAG]`                                                                                                                                 | `add n/Tom p/98763213 e/asd@gmail.com a/6 Sims Drive (s)532123 note/Python` |
| Search for an applicant                | `find [KEY]` <br> (Minimally one `KEY` must be provided) <br> <br> **Note:** You can provide multiple key to find an applicant using `NAME` . For example, `find n/Thomas Marry`  | `find n/Thomas p/98764321`                                                  |
| List all applicants                    | `list`                                                                                                                                                                            | `list`                                                                      |
| Delete an applicant                    | `delete n/NAME p/PHONE`                                                                                                                                                           | `delete n/Thomas p/98765432`                                                |
| Advance an applicant                   | `advance n/NAME p/PHONE [d/INTERVIEW DATETIME]` <br> <br> **Note:** You need to provide `INTERVIEW DATETIME` to advance applicant's `status` `APPLIED` to `ACCEPTED`              | `advance n/Thomas p/98765432 d/20-03-2024 12:12`                            |
| Reject an applicant                    | `reject n/NAME p/PHONE`                                                                                                                                                           | `reject n/Thomas p/98765432`                                                |
| View the interview dates of applicants | `interview`                                                                                                                                                                       | `interview`                                                                 |
| Edit the information of an applicant   | `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [d/INTERVIEW DATE TIME] [note/TAG]`                                                                                          | `edit 1 n/Marry p/98763245`                                                 |
| Remind an applicant's interview date   | To be updated                                                                                                                                                                     | To be updated                                                               |

### Statistics Commands
 Action                                  | Format  | Example |
|-----------------------------------------|---------|---------|
| Displays statistics collected by HMHero | `stats` | `stats` |

### General Commands
 Action                                                | Format | Example |
|-------------------------------------------------------|--------|---------|
| Shows a help dialog with a list of available commands | `help` | `help`  |
| Exits HMHero                                          | `exit` | `exit`  |


---

## Troubleshooting

**Problem:**

The JAR file not launching even after double-clicking the file.

**Solution:**

1. Open your terminal
* Windows:
    * The default key combination to launch your terminal is <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>P</kbd>
* Mac:
    * Use <kbd>Cmd</kbd>+<kbd>Space</kbd> to open Spotlight Search
    * Search for "terminal" and click it to launch.
2. Navigate to the location where "hmhero.jar" is stored within your terminal using `cd`. For example, `cd Downloads/`
3. On your terminal, run `java -jar hmhero.jar`

**Problem:**

The JAR file not launching in Windows Subsystem for Linux (WSL).

<div markdown="span" class="alert alert-info" role="alert">:information_source: **Note:** 
WSL does not support GUI applications by default. 
</div>

**Solution:**

1. Our recommendation is to run HMHero application on Windows and not on WSL.

**Problem:**

Unable to exit/save HMHero to data file

**Solution:**

1. This error is due to `hmhero.jar` being started in a protected folder. (Examples of write-protected folders include`C:\WINDOWS\System32` in windows and the `/etc` dir in linux) <br> Please move the `hmhero.jar` file into another folder in your computer and start HMHero application from that folder.

---

## FAQ

### Q: If I do not have Java 11, how do I install it on my computer? <br>
**A:** You can navigate to this site [here](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html) and download Java 11 according to your system’s specifications.

### Q: Do I need an internet connection to run HMHero? <br>
**A:** No, HMHero can boot up and run all functionalities without an internet connection.

### Q: Can I use HMHero on my mobile device?<br>
**A:** Unfortunately, HMHero is only designed to run on your desktop/laptop such that you can use the command line interface.

### Q: How do I transfer my data to another computer?<br>
**A:** Install HMHero on the other computer and overwrite the empty data file with the data file created by HMHero in your current computer.

---
## Acknowledgements


HMHero is a brownfield software engineering project based off [AddressBook Level-3](https://nus-cs2103-ay2223s2.github.io/tp/), taken under the [CS2103T Software Engineering](https://nus-cs2103-ay2223s2.github.io/website/admin/index.html) held by School of Computing at National University of Singapore.

Java dependencies:
* [JavaFX](https://openjfx.io/) for Graphical User Interface
* [JUnit5](https://github.com/junit-team/junit5) for testing
* [Jackson](https://github.com/FasterXML/jackson) for JSON-related operations

Documentation dependencies:
* [PlantUML](https://plantuml.com/) for creating UML diagrams

---

## Glossary
### A
> #### ADDRESS (Placeholder)
> The ADDRESS is a text representing the address of the applicants.
> #### Address
> The address of the applicant provided by the user.
> #### Admonitions
> Admonition boxes (or simply “admonitions”) are coloured boxes containing highlighted pieces of text.
> #### Applicant
> The person who apply to the company for the job.
> #### Application Stage
> All applicants added are at the Applied status by default. From there, hiring managers can advance their application status to Shortlisted, then to Accepted. Applicants can be rejected at any stage excepted for Accepted.

### C
> #### COMMAND_WORD (Placeholder)
> The COMMAND_WORD is a text indicating a command word of a command
> #### Command
> A feature or function that HMHero can perform.
> #### Command Line (CLI)
> The typing interface that you use to interact with HMHero. It is represented as the box where you type in commands.

### E
> #### EMAIL (Placeholder)
> The EMAIL is a text representing the email address of the applicants.
> #### Email
> The email address of the applicant provided by the user.

### F
> #### Flags
> A marker to identify the type of input by the user. For instance, in `n/NAME`, `n/` is the flag.

### G
> #### Graphical User Interface(GUI)
> A Graphical User Interface is a graphics-based interface that uses icons, menus and a mouse (to click on the icon or pull down the menus) to manage interaction with the system. In HMHero, this presents as the window that appears when launching it.

### H
> #### Help Window
> A pop-up window containing help information, shown only after calling a <kbd>help</kbd> command.
> #### Hiring Manager
> A person responsible for overseeing the recruitment process within an organization, from identifying staffing needs to making hiring decisions.

### I
> #### Input
> The text that a user would enter into HMHero
> #### INTERVIEW_DATE (Placeholder)
> The INTERVIEW_DATE is the date indicating when the applicant is having his/her interview.
> #### Interview Date
> Date where applicants are going to have their interviews. Interview date is in the format "day-month-year hour:minute", represented in the "DD-MM-YYYY HH:MM" format.

### K
> #### KEYWORD (Placeholder)
> The KEYWORD is the text we use search for an item. It can be `NAME` or `PHONE_NUMBER` of the applicant.

### N
> #### NAME (Placeholder)
> The NAME is a text representing the name of the applicants.
> #### Name
> The name of the applicant provided by the user.
> #### NOTES (Placeholder)
> The NOTES are some texts that use to represent the skill set of the applicants.
> #### Notes
> The skill set the applicant possesses provided by the user.

### O
> #### Operating System (OS)
> Is a software program that manages computer hardware and software resources, and provides common services for computer programs to run and interact with the computer hardware.
> #### Output
> The result after calling a Command. Results are displayed in the GUI.

### P
> #### Parameter
> Values that are passed while calling the Commands. For instance, when calling `find n/NAME`, parameter here is `n/NAME`.
> #### PHONE_NUMBER (Placeholder)
> The PHONE_NUMBER is an integer representing the phone number of the applicant.
> #### Phone Number
> The phone number of the applicant provided by the user.
> #### Placeholder
> Placeholders in HMHero refers to the UPPER_CASE words that appear after the flags in commands that is provided by the user. For instance, `n/NAME`, `NAME` is a placeholder

### S
> #### STATUS (Placeholder)
> The STATUS is a text that represent the current state of the applicant.
> #### Status
> Status has four stages, which are APPLIED, SHORTLISTED, ACCEPTED and REJECTED. Status can only be modified by using <kbd>advance</kbd> or <kbd>reject</kbd> command.
> #### Syntax
> The structure of statements/inputs users type into the Command Line.

### U
> #### URL
> A hyperlink to a website.

