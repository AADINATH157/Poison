# 🎯 MNIST Backdoor Attack Detection

![Python](https://img.shields.io/badge/python-3.8%2B-blue)
![PyTorch](https://img.shields.io/badge/PyTorch-2.0+-red)
![License](https://img.shields.io/badge/license-MIT-green)

*A PyTorch implementation for demonstrating, analyzing, and defending against backdoor attacks in neural networks*

## Table of Contents
- [Features](#-features)
- [Installation](#-installation)
- [Quick Start](#-quick-start)
- [Detailed Usage](#-detailed-usage)
- [Project Structure](#-project-structure)
- [Results](#-results)
- [Contributing](#-contributing)
- [Troubleshooting](#-troubleshooting)
- [References](#-references)
- [License](#-license)

## 🌟 Features
- ✅ Clean vs. poisoned model training
- 🎨 Trigger pattern visualization
- 🛡️ Multiple defense mechanisms:
  - Activation clustering
  - Anomaly detection (Isolation Forest, One-Class SVM)
  - Neural cleanse
- 📊 Model performance analytics
- 📈 t-SNE feature space visualization

## 💻 Installation

### Prerequisites
- Python 3.8+
- pip 20.0+
- (Optional) NVIDIA GPU with CUDA 11.7

### Setup
```bash
# Clone repository
git clone https://github.com/yourusername/mnist-backdoor-detection.git
cd mnist-backdoor-detection

# Create virtual environment
python -m venv venv

# Activate environment
# Windows:
.\venv\Scripts\activate
# Linux/Mac:
source venv/bin/activate

# Install dependencies
pip install -r requirements.txt