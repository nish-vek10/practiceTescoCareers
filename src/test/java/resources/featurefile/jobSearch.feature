@regression
Feature: Job Search Test
  As a User, I want to find job opportunities in Tesco using tesco-careers.com

  Scenario Outline: Search for jobs
    Given User is on homepage
    When User clicks on Accept Cookies
    And User clicks on Search And Apply from top menu Tabs
    And User selects Job Area from dropdown menu "<jobArea>"
    And User selects Function from dropdown menu "<function>"
    And User selects Role from dropdown menu "<role>"
    And User enters Town or Postcode "<location>"
    And And User selects Radius from dropdown menu "<radius>"
    And User enters Keywords "<keywords>"
    And User clicks on Search button
    Then User should verify the Header Text "<result>"
    Examples:
      | jobTitle         | location     | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                          |
      | Tester           | Harrow       | up to 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill     |
      | Retail           | Edgware      | up to 5 miles  | 300       | 500       | Per week   | Part Time | Part Time Retail jobs in Edgware                |
      | Web developer    | Essex        | up to 10 miles | 40000     | 650000    | Per annum  | Permanent | Permanent Web Developer jobs in Essex           |
      | Data Analyst     | Manchester   | up to 1 mile   | 50000     | 75000     | Per annum  | Any       | Data Analyst jobs in Manchester                 |
      | Surgeon          | HA1 1AA      | up to 10 miles | 6000      | 9000      | Per month  | Temporary | Temporary Surgeon jobs in HA1 1AA               |
      | Business Analyst | Warwickshire | up to 2 miles  | 50        | 100       | Per hour   | Permanent | Permanent Business Analyst jobs in Warwickshire |
      | Geologist        | Surrey       | up to 25 miles | 250       | 350       | Per day    | Any       | Geologist jobs in Surrey                        |

