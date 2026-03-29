# SecureLoginApp 🔐

## 📌 Project Overview
This project is a simple Java Spring Boot application that demonstrates a login system with intentionally introduced security vulnerabilities for learning DevSecOps practices.

The application exposes a REST API endpoint:

POST /api/login?username={value}&password={value}

---

## ⚙️ Features
- User login functionality
- Demonstrates common vulnerabilities:
  - Hardcoded credentials
  - SQL Injection
- Integrated DevSecOps pipeline using GitHub Actions

---

## 🛠️ Technologies Used
- Java
- Spring Boot
- Maven
- GitHub Actions

---

## 🔐 Security Tools Integrated

| Tool | Type | Purpose |
|------|------|--------|
| Gitleaks | Secret Scanning | Detects hardcoded secrets |
| SpotBugs | SAST | Identifies insecure coding patterns |
| OWASP Dependency Check | SCA | Detects vulnerable dependencies |

---

## 🚀 CI/CD Pipeline
A GitHub Actions pipeline is configured to run automatically on every push to the main branch.

### Pipeline Stages:
1. Secret Scanning (Gitleaks)
2. Build (Maven)
3. Static Analysis (SpotBugs)
4. Dependency Scanning (OWASP Dependency Check)

---

## ⚠️ Known Vulnerabilities (For Learning)
- Hardcoded password in source code
- SQL Injection via string concatenation

---

## ✅ Fixes (Recommended)
- Use environment variables for sensitive data
- Use PreparedStatement to prevent SQL Injection

---

## 📸 Evidence
GitHub Actions pipeline execution screenshots are included in the report.

---

## 👤 Author
Kishor Saravanan
