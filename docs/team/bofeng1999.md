---
layout: page
title: <Li Bo Feng> Project Portfolio Page
---

### Project: HMHero

### What should be included

- [x] Code contributed
- [x] Enhancements implemented
- [x] Contributions to the UG (Optional)
- [x] Contributions to the DG (Optional)
- [x] Contributions to team-based tasks
- [x] Review/mentoring contributions
- [x] Contributions beyond the project team

(**Overview**)

- HMHero helps Hiring Managers track the statuses of candidates' applications

(**Summary of Contributions**)

- Implemented `NamePhoneNumberPredicate` class to allow `advance`, `reject` and `find` features to access the Applicant 
  by the `name` and `phone`

- Implemented `advance` feature to advance applicants' status from `Applied` -> `Shorlisted` and 
  `Shorlisted` -> `Accepted` to be tracked in HMHero

- Implemented `reject` feature to reject applicants' status from `Applied`, `Shorlisted` and `Accpted` to `Rejected`
  to be tracked in HMHero

(**Code contributions**)

- **Code contributed**: [RepoSense link](https://nus-cs2103-ay2223s2.github.io/tp-dashboard/?search=bofeng1999&breakdown=true)

- **Project management**:

  - Helped teammates on debugging to ensure that everyone is on task.

(**Enhancements implemented**)

- **Enhancements to existing features**:

- Enhanced the `FindCommand` to check the `equals` method to return true when `namePredicate`, `phonePredicate`,
 `nameAndPhoneContainsKeywordsPredicate` returns true if both objects are null to prevent NullPointerException.

- Created test cases for AdvanceCommand and AdvanceCommandParser.

- Enhanced the `EditCommand` to allow edits on `InterviewDateTime` method.

- Improved test cases for EditCommand and EditCommandParser. 

- Enhanced the `EditCommand` and `AdvanceCommand` to check that `applicateDateTime` <= `interviewDateTime`.

- Implemented `NoteContainsKeywordsPredicateTest` and `PhoneContainsKeywordsPredicateTest`.

- **Documentation**:

  - Wrote the whole Commands Section for UserGuide.
  
  - Wrote the Trying your first command section for UserGuide

  - Wrote the Commands Summary Table for UserGuide
  
  - Wrote the Feature Implementation Section for Developer Guide.

- **Community**:

  - Reviewed PRs and give effective comments.
  
  - Helped Dun Liang in debugging NullPointerException.
  
  - Assigned issues to teammates

- **Tools**:

  - Git and Github
  
  - Sourcetree
  
  - Java

