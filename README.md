# 👔 Tailor's Assistant System

**TailorApp** is a simple yet powerful Java-based application designed to help local tailors manage their client information, measurements, orders, and inventory. It is a tool built *by a tailor, for tailors*—with real-life workshop needs in mind.

---

## 🎯 Project Goals

TailorApp aims to digitalize and streamline workshop operations by offering a system that:

- Keeps accurate client and measurement records.
- Tracks clothing orders from request to delivery.
- Manages inventory of sewing materials and accessories.
- Supports export and reporting for business decision-making.

It is a perfect solution for tailors who want to grow their efficiency, credibility, and professionalism without relying on complex or expensive systems.

---

## ✅ Features Implemented

The current version (console-based MVP) includes:

### 🧍 Client Management
- Add new clients with name, phone number, and contact info.
- View and update client profiles.

### 📏 Measurement Tracker
- Store basic and custom measurement types (e.g., chest, waist, hips).
- Link measurements to specific clients.

### 📦 Order Management
- Add orders linked to specific clients.
- Record order details: fabric, price, deadline, status.
- Track payment and order status.

### 🧵 Basic Inventory (Prototype Stage)
- Manages simple list of materials (planned for future integration).

---

## 🚧 Features in Development

Planned enhancements:

- ✅ Unique order IDs per client
- ✅ Order payment tracking
- ✅ Export orders to CSV or JSON
- 🔄 History of measurements per client
- 🧮 Revenue & fabric usage reporting
- 🔔 Delivery reminders
- 🖼️ Upload photos of finished designs
- 🖥️ Transition from console to JavaFX GUI
- 💾 Switch from in-memory to file/SQLite-based storage

---

## 🚀 How to Run the Project

### Prerequisites
- Java JDK 17+
- IDE (IntelliJ IDEA, Eclipse, or VS Code with Java support)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/TailorApp.git
   cd TailorApp
   ```
2. Compile and run the app:
   - From IDE: Run the `TailorWorkshopApp.java` file inside the `src/ui/` folder.
   - Or from terminal:
     ```bash
     javac -d bin src/**/*.java
     java -cp bin ui.TailorWorkshopApp
     ```

---

## 🤝 How to Contribute

Contributions are welcome! Whether you’re fixing a bug, adding new features, or suggesting ideas:

1. Fork the repository.
2. Create a new branch: `feature/your-feature-name`.
3. Commit your changes with clear messages.
4. Open a pull request.

### Want to help but not sure how?
Check the `TODO.md` or open an issue with your idea!

---

## 📌 Why This Matters

TailorApp isn't just a software project—it's a solution tailored for micro-businesses in fashion. It's:
- Useful for day-to-day client tracking.
- Scalable for future improvements (mobile, cloud, AI).
- A great portfolio piece to showcase your real-world impact.
---
## 📄 License
MIT License – feel free to use, modify, and distribute with credit.
