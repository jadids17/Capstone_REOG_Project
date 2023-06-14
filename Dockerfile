FROM python:3.10.10

WORKDIR /app

RUN pip install --upgrade pip

COPY requirements.txt requirements.txt

RUN pip install --upgrade pip
RUN pip install -r requirements.txt

COPY . .

EXPOSE 8081

ENV PYTHONUNBUFFERED=1

CMD ["python", "-u", "main.py"]

# CMD ["uvicorn", "--host", "0.0.0.0", "--port", "8081", "main:app"]
