FROM python:3.10.10

WORKDIR /app

COPY requirements.txt requirements.txt

RUN pip install --upgrade pip
RUN pip install -r requirements.txt

COPY . .

ENV PYTHONUNBUFFERED=1

CMD ["python", "-u",  "--host", "0.0.0.0", "--port", "8081", "main.py"]

# CMD ["uvicorn", "--host", "0.0.0.0", "--port", "8081", "main:app"]