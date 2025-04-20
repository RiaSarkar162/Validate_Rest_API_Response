# 📊 Validate REST API Response using Rest Assured

This Maven-based project demonstrates how to **automate validation of complex JSON API responses** using **Rest Assured** in Java. The dummy API response used includes details about courses and a purchase dashboard.

## ✅ What This Project Does

The project performs the following validations and extractions from a mock API response:

1. Print the number of courses returned by the API
2. Print the total purchase amount
3. Print the title of the first course
4. Print all course titles and their respective prices
5. Print the number of copies sold by the "RPA" course
6. **Verify** if the sum of all course prices (price × copies) matches the purchase amount

## 🧰 Tech Stack

- Java
- Rest Assured
- Maven
- TestNG

  ## 🧪 Sample JSON Response Used

```json
{
  "dashboard": {
    "purchaseAmount": 910,
    "website": "rahulshettyacademy.com"
  },
  "courses": [
    {
      "title": "Selenium Python",
      "price": 50,
      "copies": 6
    },
    {
      "title": "Cypress",
      "price": 40,
      "copies": 4
    },
    {
      "title": "RPA",
      "price": 45,
      "copies": 10
    }
  ]
}
