# QRCode Generator

A Java-based application for generating QR codes.

## Tech Stack

- **Java**: Core language for QR code generation logic.
- **(Optional) Docker**: For containerized deployment and ease of use.

## Features

- Generate QR codes from text input
- Save QR codes as images
- Simple to use and configure

## Getting Started

### Prerequisites

- Java 8 or above
- (Optional) Docker

### Clone the repository

```bash
git clone https://github.com/Felipogdev/qrcode-generator.git
cd qrcode-generator
```

### Build and Run

#### Using Java

```bash
javac -d bin src/*.java
java -cp bin Main
```
_Replace `Main` with your main class if different._

#### Using Docker

```bash
docker build -t qrcode-generator .
docker run --rm qrcode-generator
```

## Usage

You can generate a QR code by providing the desired text data. For example:

```bash
java -cp bin Main "https://example.com"
```
_Outputs a QR code image file (e.g., `qrcode.png`). Adjust parameters as needed._

## Contributing

Contributions are welcome! Please fork the repo and submit a pull request.

## License

Specify your license here.

---

**Project Repository:** [qrcode-generator](https://github.com/Felipogdev/qrcode-generator)
